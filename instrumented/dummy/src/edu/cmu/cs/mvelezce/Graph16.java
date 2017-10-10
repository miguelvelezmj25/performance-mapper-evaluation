package edu.cmu.cs.mvelezce;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by mvelezce on 4/21/17.
 */
public class Graph16 {

    public static void main(String[] args) throws PngException {
        DisplayMode image = null;
        final int bits = image.getBitDepth();
        Collection<? extends PngPixel> colors = null;
        final List<PngPixel> copy = new ArrayList<>(colors);

        for(PngPixel pa : colors) {
            int timeout = 0;
            long start = 0;
            if(timeout > 0 && (System.currentTimeMillis() - start > timeout)) {
                throw new PngException("Reached " + timeout + "ms timeout");
            }

            if(!pa.isDuplicate()) {
                for(Iterator<PngPixel> it = copy.iterator(); it.hasNext(); ) {
                    final PngPixel pb = it.next();

                    int distThreshold = 0;
                    if(pb.isDuplicate()) {
                        it.remove();

                    }
                    else if(pa != pb && pa.rgbaDistance(pb, bits) < distThreshold) {
                        if(pa.getFreq() > pb.getFreq()) {
                            pb.setDuplicate(true);
                            it.remove();
                        }
                        else {
                            pa.setDuplicate(true);
                        }
                    }
                }
            }
        }

        final List<PngPixel> results = new ArrayList<>();
        for(PngPixel p : colors) {
            if(!p.isDuplicate()) {
                results.add(p);
            }
        }

    }

    private static class PngPixel {
        private boolean duplicate;
        private int freq;

        public boolean isDuplicate() {
            return duplicate;
        }

        public void setDuplicate(boolean duplicate) {
            this.duplicate = duplicate;
        }

        public int rgbaDistance(PngPixel pb, int bits) {
            return (int) Math.random();
        }

        public int getFreq() {
            return freq;
        }
    }

    private static class PngException extends Throwable {
        public PngException(String s) {

        }
    }
}