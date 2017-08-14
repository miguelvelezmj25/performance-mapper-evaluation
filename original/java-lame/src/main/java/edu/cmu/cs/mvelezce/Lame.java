package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import net.sourceforge.lame.lowlevel.LameEncoder;
import net.sourceforge.lame.mp3.MPEGMode;

import javax.sound.sampled.AudioFormat;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Enconding (JDK)
 * AudioFormat (JDK)
 * Lame
 * LameEncoder
 * LameGlobalFlags
 * LameInternalFlags
 * MPEGMode
 */
public class Lame {

    public static boolean HIGHBITRATE;
    public static boolean MPEGMODE;
//    public static boolean useStereo = false;
//    public static boolean useHighQuality = false;
//    public static boolean useVBR = false;

    public static void main(String[] args) throws IOException {
        HIGHBITRATE = Source.getOptionHIGHBITRATE(true);
        MPEGMODE = Source.getOptionMPEGMODE(true);

        int bitRate;
        MPEGMode mpegMode;


        if(HIGHBITRATE) {
            bitRate = 256;
        }
        else {
            bitRate = 64;
        }

        if(MPEGMODE) {
            mpegMode = MPEGMode.STEREO;
        }
        else {
            mpegMode = MPEGMode.MONO;
        }



        String fileLocation = "/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/java-lame/resources/test.wav";
        Path path = Paths.get(fileLocation);
        byte[] fileInBytes = java.nio.file.Files.readAllBytes(path);

        AudioFormat inputFormat = new AudioFormat(16000, 16, 2, true, true);
        LameEncoder encoder = new LameEncoder(inputFormat, bitRate, mpegMode, net.sourceforge.lame.mp3.Lame.QUALITY_HIGHEST, false);


//
//        if(useStereo) {
//            encoder.chMode = MPEGMode.STEREO;
//        }
//        else {
//            encoder.chMode = MPEGMode.MONO;
//        }
//
//        if(useHighQuality) {
//            encoder.quality = Lame.QUALITY_HIGHEST;
//        }
//        else {
//            encoder.quality = Lame.QUALITY_LOWEST;
//        }
//
//        if(useVBR) {
//            encoder.vbrMode = true;
//        }
//        else {
//            encoder.vbrMode = false;
//        }

        encoder.initParams(inputFormat);

        ByteArrayOutputStream mp3 = new ByteArrayOutputStream();
        byte[] buffer = new byte[encoder.getPCMBufferSize()];

        int bytesToTransfer = Math.min(buffer.length, fileInBytes.length);
        int bytesWritten;
        int currentPcmPosition = 0;
        while (Sink.getDecision(0 < (bytesWritten = encoder.encodeBuffer(fileInBytes, currentPcmPosition, bytesToTransfer, buffer)))) {
            currentPcmPosition += bytesToTransfer;
            bytesToTransfer = Math.min(buffer.length, fileInBytes.length - currentPcmPosition);
            mp3.write(buffer, 0, bytesWritten);
        }

        FileOutputStream outStream = new FileOutputStream("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/java-lame/resources/test.mp3");
        mp3.writeTo(outStream);

        encoder.close();
        mp3.toByteArray();
    }

//    public static byte[] encodeToMp3(byte[] pcm) throws IOException {
//        AudioFormat inputFormat = new AudioFormat(16000, 16, 2, true, true);
//        LameEncoder encoder = new LameEncoder(inputFormat, 256, MPEGMode.STEREO, Lame.QUALITY_HIGHEST, false);
//
//        ByteArrayOutputStream mp3 = new ByteArrayOutputStream();
//        byte[] buffer = new byte[encoder.getPCMBufferSize()];
//
//        int bytesToTransfer = Math.min(buffer.length, pcm.length);
//        int bytesWritten;
//        int currentPcmPosition = 0;
//        while (0 < (bytesWritten = encoder.encodeBuffer(pcm, currentPcmPosition, bytesToTransfer, buffer))) {
//            currentPcmPosition += bytesToTransfer;
//            bytesToTransfer = Math.min(buffer.length, pcm.length - currentPcmPosition);
//            mp3.write(buffer, 0, bytesWritten);
//        }
//
//        FileOutputStream outStream = new FileOutputStream("/Users/mvelezce/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/java-lame/resources/test.mp3");
//        mp3.writeTo(outStream);
//
//        encoder.close();
//        return mp3.toByteArray();
//    }

}
