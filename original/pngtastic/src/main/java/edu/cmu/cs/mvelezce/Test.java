package edu.cmu.cs.mvelezce;

import com.googlecode.pngtastic.core.PngImage;
import com.googlecode.pngtastic.core.PngOptimizer;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * Created by miguelvelez on 6/14/17.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        // load png image from a file
        final InputStream in = new BufferedInputStream(new FileInputStream("/Users/miguelvelez/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/pngtastic/images/optimizer/amigaball.png"));
        final PngImage image = new PngImage(in);

        // optimize
        final PngOptimizer optimizer = new PngOptimizer();
        final PngImage optimizedImage = optimizer.optimize(image);

        // export the optimized image to a new file
        final ByteArrayOutputStream optimizedBytes = new ByteArrayOutputStream();
        optimizedImage.writeDataOutputStream(optimizedBytes);
        optimizedImage.export("/Users/miguelvelez/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/pngtastic/images/optimizer/output.png", optimizedBytes.toByteArray());
    }

}
