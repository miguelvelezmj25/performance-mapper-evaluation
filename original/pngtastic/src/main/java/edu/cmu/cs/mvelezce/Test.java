package edu.cmu.cs.mvelezce;

import com.googlecode.pngtastic.PngtasticColorCounter;
import com.googlecode.pngtastic.core.PngImage;
import com.googlecode.pngtastic.core.PngOptimizer;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by miguelvelez on 6/14/17.
 */
public class Test {

//    public static boolean useDistThreshold = false;
//    public static boolean useFreqThreshold = false;
//
//    public static void main(String[] args) throws Exception {
//        Double distThreshold = 0.005D;
//        Double freqThreshold = 0.0005D;
//        Integer minAlpha = 30;
//        Integer timeout = 0;
//        String logLevel = "none";
//
//        if(useFreqThreshold) {
//            freqThreshold = 1.0D;
//        }
//        else {
//            freqThreshold = 0.0D;
//        }
//
//        if(useDistThreshold) {
//            distThreshold = 1.0D;
//        }
//        else {
//            distThreshold = 0.0D;
//        }
//
//        String[] files = {"/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/pngtastic/images/optimizer/amigaball.png"};
//
//        new PngtasticColorCounter(files, logLevel, distThreshold, freqThreshold, minAlpha, timeout);
//
////        if(useFreqThreshold) {
////            new PngtasticColorCounter(files, logLevel, distThreshold, 1.0D, minAlpha, timeout);
////        }
////        else {
////            new PngtasticColorCounter(files, logLevel, distThreshold, 0.0D, minAlpha, timeout);
////        }
//
////        // load png image from a file
////        final InputStream in = new BufferedInputStream(new FileInputStream("/Users/miguelvelez/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/pngtastic/images/optimizer/amigaball.png"));
////        final PngImage image = new PngImage(in);
////
////        // optimize
////        final PngOptimizer optimizer = new PngOptimizer();
////        final PngImage optimizedImage = optimizer.optimize(image);
////
////        // export the optimized image to a new file
////        final ByteArrayOutputStream optimizedBytes = new ByteArrayOutputStream();
////        optimizedImage.writeDataOutputStream(optimizedBytes);
////        optimizedImage.export("/Users/miguelvelez/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/pngtastic/images/optimizer/output.png", optimizedBytes.toByteArray());
//    }

}
