package edu.cmu.cs.mvelezce;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import kanzi.app.BlockCompressor;

import java.util.HashMap;
import java.util.Map;


public class KanziMain {

    private static boolean VERBOSE;
    private static boolean FORCE;
    private static boolean LEVEL;
    private static boolean BLOCK;
    private static boolean ENTROPY;
    private static boolean TRANSFORM;
    private static boolean CHECKSUM;

    public static void main(String[] args) {
        Sink.init();

        VERBOSE = Source.getOptionVERBOSE(true);
        FORCE = Source.getOptionFORCE(true);
        LEVEL = Source.getOptionLEVEL(true);
        BLOCK = Source.getOptionBLOCK(true);
        ENTROPY = Source.getOptionENTROPY(true);
        TRANSFORM = Source.getOptionTRANSFORM(true);
        CHECKSUM = Source.getOptionCHECKSUM(true);

        int verbose = 0;
        boolean force = false;
        int level = 0;
        int block = 1024 * 1024;
        String entropy = "HUFFMAN";
        String transform = "BWT+MTFT+ZRLT";
        boolean checksum = false;

        if(VERBOSE) {
            verbose = 4;
        }

        if(FORCE) {
            force = true;
        }

        if(LEVEL) {
            level = 5;
        }

        if(BLOCK) {
            block *= 1024;
        }

        if(ENTROPY) {
            entropy = "ANS";
        }

        if(TRANSFORM) {
            transform = "BWT+LZ4+ZRLT+RANK+TEXT";
        }

        if(CHECKSUM) {
            checksum = true;
        }

        BlockCompressor bc = null;

        try {
            Map<String, Object> map = new HashMap<>();
            bc = new BlockCompressor(verbose, force, level, block, entropy, transform, checksum, 1, map, null);
        } catch (Exception e) {
            System.err.println("Could not create the compressor: " + e.getMessage());
            System.exit(kanzi.io.Error.ERR_CREATE_COMPRESSOR);
        }

        final int code = bc.call();
        if(code != 0) {
            bc.dispose();
        }

        System.exit(code);

//        if(mode == 'd') {
//            BlockDecompressor bd = null;
//
//            try {
//                bd = new BlockDecompressor(map, null);
//            } catch (Exception e) {
//                System.err.println("Could not create the decompressor: " + e.getMessage());
//                System.exit(kanzi.io.Error.ERR_CREATE_DECOMPRESSOR);
//            }
//
//            final int code = bd.call();
//
//            if(code != 0) {
//                bd.dispose();
//            }
//
//            System.exit(code);
//        }
    }
}

