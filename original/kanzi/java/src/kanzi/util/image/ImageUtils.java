/*
Copyright 2011-2017 Frederic Langlet
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
you may obtain a copy of the License at

                http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package kanzi.util.image;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


// Dependency on Java AWT package
public class ImageUtils {
    public static final int NO_TRANSFORM = 0;
    public static final int MIRROR_TRANSFORM = 1;
    public static final int FLIP_TRANSFORM = 2;
    public static final int ROTATE_TRANSFORM = 4;

    // for each direction, deltaX,deltaY for even,odd positions
    public static final int[] DIR_INC_XY =
            {
                    1, 0, 1, 0, 1, 0, 1, -1, 1, -1, 1, -1, 1, 0, 1, -1,
                    0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1
            };
    private final int width;
    private final int height;
    private final int stride;
    private int[] iBuf;
    private byte[] bBuf;
    public ImageUtils(int width, int height) {
        this(width, height, width);
    }


    public ImageUtils(int width, int height, int stride) {
        if(height < 8) {
            throw new IllegalArgumentException("The height must be at least 8");
        }

        if(width < 8) {
            throw new IllegalArgumentException("The width must be at least 8");
        }

        if(stride < 8) {
            throw new IllegalArgumentException("The stride must be at least 8");
        }

        this.iBuf = new int[0];
        this.bBuf = new byte[0];
        this.width = width;
        this.height = height;
        this.stride = stride;
    }

    public static ImageInfo loadImage(InputStream is, String type) throws IOException {
        switch (type.toUpperCase()) {
            case "PGM":
            case "PNM":
            case "PPM":
                return loadPPM(is);

            case "BMP":
            case "GIF":
            case "PNG":
            case "JPG":
            case "JPEG": {
                Image image = ImageIO.read(is);

                if(image == null) {
                    return null;
                }

                int w = image.getWidth(null);
                int h = image.getHeight(null);
                int[] data = createCompatibleImage(image, w, h);
                return new ImageInfo(w, h, data);
            }

            default:
                try {
                    // Use reflection to check class dependencies at runtime and avoid
                    // the requirement of having the JAI jar at build time (optional jar).
                    Class cl1 = Class.forName("com.sun.media.jai.codec.SeekableStream");
                    Method m = cl1.getDeclaredMethod("wrapInputStream", new Class[]{InputStream.class, Boolean.TYPE});
                    Object ss = m.invoke(null, new Object[]{is, true});
                    Class cl2 = Class.forName("javax.media.jai.JAI");
                    m = cl2.getDeclaredMethod("create", new Class[]{String.class, Object.class});
                    Object ro = m.invoke(null, new Object[]{"stream", ss});
                    Class cl3 = Class.forName("javax.media.jai.RenderedOp");
                    m = cl3.getDeclaredMethod("getWidth", new Class[0]);
                    Integer w = (Integer) m.invoke(ro, new Object[0]);
                    m = cl3.getDeclaredMethod("getHeight", new Class[0]);
                    Integer h = (Integer) m.invoke(ro, new Object[0]);
                    m = cl3.getSuperclass().getDeclaredMethod("getAsBufferedImage", new Class[0]);
                    Image image = (Image) m.invoke(ro, new Object[0]);
                    int[] data = createCompatibleImage(image, w, h);
                    return new ImageInfo(w, h, data);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | SecurityException |
                        IllegalArgumentException | InvocationTargetException e) {
                    // JAI classes not available or method invocation failed
                    e.printStackTrace();
                    return null;
                }
        }
    }

    private static int[] createCompatibleImage(Image image, int w, int h) {
        int[] data = new int[w * h];
        GraphicsDevice gs = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices()[0];
        GraphicsConfiguration gc = gs.getDefaultConfiguration();
        BufferedImage img = gc.createCompatibleImage(w, h, Transparency.OPAQUE);
        img.getGraphics().drawImage(image, 0, 0, null);
        img.getRaster().getDataElements(0, 0, w, h, data);
        return data;
    }

    public static ImageInfo loadPPM(InputStream is) throws IOException {
        boolean raw;
        DataInputStream dis = null;

        try {
            dis = new DataInputStream(new BufferedInputStream(is));
            String type = readWord(dis);

            if(type.charAt(0) != 'P') {
                throw new IOException("Invalid format: not a PBM/PGM/PPM file");
            }

            switch (type.charAt(1)) {
                case '1':
                case '2':
                case '3':
                    raw = false;
                    break;

                case '4':
                case '5':
                case '6':
                    raw = true;
                    break;

                default:
                    throw new IOException("Invalid format " + type);
            }

            final int w = readInt(dis);
            final int h = readInt(dis);
            int maxColors = readInt(dis);

            if((maxColors <= 0) || (maxColors > 255)) {
                throw new IOException("Invalid number of colors " + maxColors);
            }

            int[] data = new int[w * h];
            int offs = 0;

            if(raw == true) {
                final byte row[] = new byte[3 * w];

                for(int j = 0; j < h; j++) {
                    dis.readFully(row);

                    for(int i = 0, k = 0; i < w; i++, k += 3) {
                        final int r = (row[k] + 256) & 0xFF;
                        final int g = (row[k + 1] + 256) & 0xFF;
                        final int b = (row[k + 2] + 256) & 0xFF;
                        data[offs + i] = (r << 16) | (g << 8) | b;
                    }

                    offs += w;
                }
            }
            else {
                for(int j = 0; j < h; j++) {
                    for(int i = 0; i < w; i++) {
                        final int r = readInt(dis);
                        final int g = readInt(dis);
                        final int b = readInt(dis);
                        data[offs + i] = (r << 16) | (g << 8) | b;
                    }

                    offs += w;
                }
            }

            return new ImageInfo(w, h, data);
        } finally {
            try {
                if(dis != null) {
                    dis.close();
                }
            } catch (IOException io) {
                // Ignore;
            }
        }
    }

    private static String readWord(InputStream is) throws IOException {
        StringBuilder builder = new StringBuilder(100);
        BufferedReader br = null;
        int b;

        // Get rid of leading whitespace
        do {
            if((b = is.read()) == -1) {
                throw new EOFException();
            }

            if(b == '#') {
                // Read ppm comment
                if(br == null) {
                    br = new BufferedReader(new InputStreamReader(is));
                }

                br.readLine();
                b = ' ';  // continue reading
            }
        }
        while (Character.isWhitespace((char) b));

        do {
            builder.append((char) b);

            if((b = is.read()) == -1) {
                throw new EOFException();
            }
        }
        while (!Character.isWhitespace((char) b));

        return builder.toString();
    }

    private static int readInt(InputStream is) throws IOException {
        BufferedReader br = null;
        int res = 0;
        int b;

        // Get rid of leading whitespace
        do {
            if((b = is.read()) == -1) {
                throw new EOFException();
            }

            if(b == '#') {
                // Read ppm comment
                if(br == null) {
                    br = new BufferedReader(new InputStreamReader(is));
                }

                br.readLine();
                b = ' ';  // continue reading
            }
        }
        while (Character.isWhitespace((char) b));

        do {
            res *= 10;
            res += (b - '0');

            if((b = is.read()) == -1) {
                throw new EOFException();
            }
        }
        while (!Character.isWhitespace((char) b));

        return res;
    }

    public static Direction getOrthogonal(Direction dir) {
        switch (dir) {
            case HORIZONTAL:
                return Direction.VERTICAL;
            case ANGLE_30:
                return Direction.ANGLE_120;
            case ANGLE_45:
                return Direction.ANGLE_135;
            case ANGLE_60:
                return Direction.ANGLE_150;
            case VERTICAL:
                return Direction.HORIZONTAL;
            case ANGLE_120:
                return Direction.ANGLE_30;
            case ANGLE_135:
                return Direction.ANGLE_45;
            case ANGLE_150:
                return Direction.ANGLE_60;
            default:
                throw new IllegalArgumentException("Invalid direction");
        }
    }

    public int[] flip(int[] data) {
        final int w = this.width;
        final int h = this.height;
        final int st = this.stride;

        if(this.iBuf.length < w) {
            this.iBuf = new int[w];
        }

        final int h2 = h >> 1;
        int offs1 = 0;
        int offs2 = (h - 1) * st;

        for(int j = 0; j < h2; j++) {
            System.arraycopy(data, offs2, this.iBuf, 0, w);
            System.arraycopy(data, offs1, data, offs2, w);
            System.arraycopy(this.iBuf, 0, data, offs1, w);
            offs1 += st;
            offs2 -= st;
        }

        return data;
    }

    public int[] toGrey(int[] rgb) {
        final int length = this.width * this.height;

        for(int i = 0; i < length; i++) {
            // Luminance from rec601 Y = 0.299*r + 0.587*g + 0.114*b
            // Use fast approximation Y = (2*r + 5*g + 1*b) / 8
            final int val = rgb[i];
            final int grey = (((val >> 15) & 0x1FE) + 5 * ((val >> 8) & 0xFF) + (val & 0xFF) + 4) >> 3;
            rgb[i] = (grey << 16) | (grey << 8) | grey;
        }

        return rgb;
    }

    // Expand to new dw x dh dimensions by duplicating last row / last column
    public int[] pad(int[] data, int dw, int dh) {
        final int sw = this.width;
        final int sh = this.height;

        if(dw < sw) {
            throw new IllegalArgumentException("Destination width must be greater than source width");
        }

        if(dh < sh) {
            throw new IllegalArgumentException("Destination height must be greater than source height");
        }

        if((sw == dw) && (sh == dh)) {
            return data;
        }

        if(data.length < dw * dh) {
            final int[] tmp = new int[dw * dh];
            int offs1 = 0;
            int offs2 = 0;

            for(int j = 0; j < sh; j++) {
                System.arraycopy(data, offs1, tmp, offs2, sw);
                final int lastRow = tmp[offs2 + sw - 1];

                // Duplicate last row
                for(int i = sw; i < dw; i++)
                    tmp[offs2 + i] = lastRow;

                offs1 += sw;
                offs2 += dw;
            }

            final int lastOffs = offs2 - dw;

            // Duplicate last column
            for(int j = sh; j < dh; j++) {
                System.arraycopy(tmp, lastOffs, tmp, offs2, dw);
                offs2 += dw;
            }

            data = tmp;
        }
        else // original data buffer is big enough
        {
            int offs = 0;

            for(int j = 0; j < sh; j++) {
                final int lastRow = data[offs + sw - 1];

                // Duplicate last row
                for(int i = sw; i < dw; i++)
                    data[offs + i] = lastRow;

                offs += dw;
            }

            final int lastOffs = offs - dw;

            // Duplicate last column
            for(int j = sh; j < dh; j++) {
                System.arraycopy(data, lastOffs, data, offs, dw);
                offs += dw;
            }
        }

        return data;
    }

    public int[] mirror(int[] data) {
        final int w = this.width - 1;
        final int h = this.height;
        final int st = this.stride;
        final int w2 = this.width >> 1;
        int offs = 0;

        for(int j = 0; j < h; j++) {
            for(int i = 0; i < w2; i++) {
                final int tmp = data[offs + w - i];
                data[offs + w - i] = data[offs + i];
                data[offs + i] = tmp;
            }

            offs += st;
        }

        return data;
    }

    public byte[] toGrey(byte[] rgb) {
        final int length = 3 * this.width * this.height;

        for(int i = 0; i < length; i += 3) {
            // Luminance from rec601 Y = 0.299*r + 0.587*g + 0.114*b
            // Use fast approximation Y = (2*r + 5*g + 1*b) / 8
            final int grey = (((rgb[i] & 0xFF) << 1) + 5 * (rgb[i + 1] & 0xFF) + (rgb[i + 2] & 0xFF) + 4) >> 3;
            rgb[i] = (byte) grey;
            rgb[i + 1] = (byte) grey;
            rgb[i + 2] = (byte) grey;
        }

        return rgb;
    }

    public byte[] flip(byte[] data) {
        final int w = this.width;
        final int h = this.height;
        final int st = this.stride;

        if(this.bBuf.length < w) {
            this.bBuf = new byte[w];
        }

        final int h2 = h >> 1;
        int offs1 = 0;
        int offs2 = (h - 1) * st;

        for(int j = 0; j < h2; j++) {
            System.arraycopy(data, offs2, this.bBuf, 0, w);
            System.arraycopy(data, offs1, data, offs2, w);
            System.arraycopy(this.bBuf, 0, data, offs1, w);
            offs1 += st;
            offs2 -= st;
        }

        return data;
    }

    public byte[] mirror(byte[] data) {
        final int w = this.width - 1;
        final int h = this.height;
        final int st = this.stride;
        final int w2 = this.width >> 1;
        int offs = 0;

        for(int j = 0; j < h; j++) {
            for(int i = 0; i < w2; i++) {
                final byte tmp = data[offs + w - i];
                data[offs + w - i] = data[offs + i];
                data[offs + i] = tmp;
            }

            offs += st;
        }

        return data;
    }

    // Expand to new dw x dh dimensions by duplicating last row / last column
    public byte[] pad(byte[] data, int dw, int dh) {
        final int sw = this.width;
        final int sh = this.height;

        if(dw < sw) {
            throw new IllegalArgumentException("Destination width must be greater than source width");
        }

        if(dh < sh) {
            throw new IllegalArgumentException("Destination height must be greater than source height");
        }

        if((sw == dw) && (sh == dh)) {
            return data;
        }

        if(data.length < dw * dh) {
            final byte[] tmp = new byte[dw * dh];
            int offs1 = 0;
            int offs2 = 0;


            for(int j = 0; j < sh; j++) {
                System.arraycopy(data, offs1, tmp, offs2, sw);
                final byte lastRow = tmp[offs2 + sw - 1];

                // Duplicate last row
                for(int i = sw; i < dw; i++)
                    tmp[offs2 + i] = lastRow;

                offs1 += sw;
                offs2 += dw;
            }

            final int lastOffs = offs2 - dw;

            // Duplicate last column
            for(int j = sh; j < dh; j++) {
                System.arraycopy(tmp, lastOffs, tmp, offs2, dw);
                offs2 += dw;
            }

            data = tmp;
        }
        else // original data buffer is big enough
        {
            int offs = 0;

            for(int j = 0; j < sh; j++) {
                final byte lastRow = data[offs + sw - 1];

                // Duplicate last row
                for(int i = sw; i < dw; i++)
                    data[offs + i] = lastRow;

                offs += dw;
            }

            final int lastOffs = offs - dw;

            // Duplicate last column
            for(int j = sh; j < dh; j++) {
                System.arraycopy(data, lastOffs, data, offs, dw);
                offs += dw;
            }
        }

        return data;
    }

    public boolean splitChannels(int[] src, int[] chan1, int[] chan2, int[] chan3,
                                 int nbChannels) {
        if((nbChannels != 1) && (nbChannels != 3)) {
            return false;
        }

        if(nbChannels == 1) {
            for(int i = this.width * this.height - 1; i >= 0; i--)
                chan1[i] = chan2[i] = chan3[i] = src[i] & 0xFF;
        }
        else {
            for(int i = this.width * this.height - 1; i >= 0; i--) {
                final int pix = src[i];
                chan1[i] = (pix >> 16) & 0xFF;
                chan2[i] = (pix >> 8) & 0xFF;
                chan3[i] = pix & 0xFF;
            }
        }

        return true;
    }


    public boolean combineChannels(int[] chan1, int[] chan2, int[] chan3, int[] dst,
                                   int nbChannels) {
        if((nbChannels != 1) && (nbChannels != 3)) {
            return false;
        }

        if(nbChannels == 1) {
            for(int i = this.width * this.height - 1; i >= 0; i--)
                dst[i] = ((chan1[i] & 0xFF) << 16) | ((chan1[i] & 0xFF) << 8) | (chan1[i] & 0xFF);
        }
        else {
            for(int i = this.width * this.height - 1; i >= 0; i--)
                dst[i] = ((chan1[i] & 0xFF) << 16) | ((chan2[i] & 0xFF) << 8) | (chan3[i] & 0xFF);
        }

        return true;
    }


    // Compute direction of block of pixels at x,y
    public Direction computeDirection(int[] input, int x, int y, int blockDim) {
        // Skip borders
        if((x < 3) || (x + blockDim + 3 >= this.width)) {
            return Direction.VERTICAL;
        }

        if((y < 3) || (y + blockDim + 3 >= this.height)) {
            return Direction.HORIZONTAL;
        }

        final int st = this.stride;
        final int start = (y * st) + x;
        final int endj = start + (st * blockDim);
        Direction res = Direction.HORIZONTAL;
        int minSAD = Integer.MAX_VALUE;

        for(Direction dir : Direction.values()) {
            // Compute Sum of Absolute Differences
            int sad = 0;
            final int dXEven = DIR_INC_XY[dir.ordinal() << 2];
            final int dXOdd = DIR_INC_XY[(dir.ordinal() << 2) + 2];
            final int dYEven = DIR_INC_XY[(dir.ordinal() << 2) + 1] * st;
            final int dYOdd = DIR_INC_XY[(dir.ordinal() << 2) + 3] * st;

            for(int j = start; j < endj; j += st) {
                for(int i = 0; i < blockDim; ) {
                    // Find which pixel is the preceding one in the scanning order
                    // defined by the direction
                    {
                        final int offs = j + i;
                        final int val = (input[offs] & 0xFF) - (input[offs - dXEven - dYEven] & 0xFF);
                        sad += ((val + (val >> 31)) ^ (val >> 31)); //abs
                        i++;
                    }

                    {
                        final int offs = j + i;
                        final int val = (input[offs] & 0xFF) - (input[offs - dXOdd - dYOdd] & 0xFF);
                        sad += ((val + (val >> 31)) ^ (val >> 31)); //abs
                        i++;
                    }
                }
            }

            if(sad < minSAD) {
                minSAD = sad;
                res = dir;

                if(minSAD == 0) {
                    break;
                }
            }
        }

        return res;
    }


    public enum Direction {
        HORIZONTAL, // Horizontal
        ANGLE_30,   // Directional 30 degrees
        ANGLE_45,   // Diagonal 45 degrees
        ANGLE_60,   // Directional 60 degrees
        VERTICAL,   // Vertical
        ANGLE_120,  // Directional 120 degrees
        ANGLE_135,  // Diagonal 135 degrees
        ANGLE_150   // Directional 150 degrees
    }

    public static class ImageInfo {
        public final int width;
        public final int height;
        public final int[] data;


        public ImageInfo(int width, int height, int[] data) {
            this.width = width;
            this.height = height;
            this.data = data;
        }
    }
}
