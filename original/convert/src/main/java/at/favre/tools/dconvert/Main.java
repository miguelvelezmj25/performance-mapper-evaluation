/*
 *  Copyright 2016 Patrick Favre-Bulle
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package at.favre.tools.dconvert;

import at.favre.tools.dconvert.arg.*;
import at.favre.tools.dconvert.ui.CLIInterpreter;
import at.favre.tools.dconvert.util.MiscUtil;
import edu.cmu.cs.mvelezce.analysis.option.Sink;
import edu.cmu.cs.mvelezce.analysis.option.Source;
import org.apache.commons.cli.Options;

import java.io.File;
import java.io.IOException;
import java.util.*;

/**
 * Entry point of the app. Use arg -h to get help.
 */
public final class Main {

    public static boolean SCALE;
    public static boolean PLATFORM;
    public static boolean OUTPUTCOMPRESSIONGMODE;
    public static boolean SCALEMODE;
    public static boolean SCALEISHEIGHTDP;
    public static boolean DOWNSCALINGALGORITHM;
    public static boolean UPSCALINGALGORITHM;
    public static boolean COMPRESSQUALITY;
    public static boolean SKIPEXISTINGFILES;
    public static boolean SKIPUPSCALING;
    public static boolean VERBOSELOG;
    public static boolean INCLUDEANDROIDLDPITVDPI;
    public static boolean HALTONERROR;
    public static boolean CREATEMIPMAPINSTEADOFDRAWABLEDIR;
    public static boolean ENABLEPNGCRUSH;
    public static boolean ENABLEMOZJPEG;
    public static boolean POSTCONVERTWEBP;
    public static boolean ENABLEANTIALIASING;
    public static boolean DRYRUN;
    public static boolean KEEPUNOPTIMIZEDFILESPOSTPROCESSOR;
    public static boolean ROUNDINGHANDLER;
    public static boolean IOSCREATEIMAGESETFOLDERS;
    public static boolean CLEARDIRBEFORECONVERT;
    public static boolean HELP;
    public static boolean VERSION;
    public static boolean GUIADVANCEDOPTIONS;

    public Main() {
    }

    public static void main(String[] rawArgs) {
        Sink.init();

        File src = new File(System.getProperty("user.home") + "/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/convert/files/person.jpg");
        File dst = new File(System.getProperty("user.home") + "/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/convert/output");

        SCALE = Source.getOptionSCALE(Boolean.valueOf(false));
        PLATFORM = Source.getOptionPLATFORM(Boolean.valueOf(false));
        OUTPUTCOMPRESSIONGMODE = Source.getOptionOUTPUTCOMPRESSIONGMODE(Boolean.valueOf(false));
        SCALEMODE = Source.getOptionSCALEMODE(Boolean.valueOf(false));
        SCALEISHEIGHTDP = Source.getOptionSCALEISHEIGHTDP(Boolean.valueOf(false));
        DOWNSCALINGALGORITHM = Source.getOptionDOWNSCALINGALGORITHM(Boolean.valueOf(false));
        UPSCALINGALGORITHM = Source.getOptionUPSCALINGALGORITHM(Boolean.valueOf(false));
        COMPRESSQUALITY = Source.getOptionCOMPRESSQUALITY(Boolean.valueOf(false));
        SKIPEXISTINGFILES = Source.getOptionSKIPEXISTINGFILES(Boolean.valueOf(false));
        SKIPUPSCALING = Source.getOptionSKIPUPSCALING(Boolean.valueOf(false));
        VERBOSELOG = Source.getOptionVERBOSELOG(Boolean.valueOf(false));
        INCLUDEANDROIDLDPITVDPI = Source.getOptionINCLUDEANDROIDLDPITVDPI(Boolean.valueOf(false));
        HALTONERROR = Source.getOptionHALTONERROR(Boolean.valueOf(false));
        CREATEMIPMAPINSTEADOFDRAWABLEDIR = Source.getOptionsCREATEMIPMAPINSTEADOFDRAWABLEDIR(Boolean.valueOf(false));
        ENABLEPNGCRUSH = Source.getOptionsENABLEPNGCRUSH(Boolean.valueOf(false));
        ENABLEMOZJPEG = Source.getOptionsENABLEMOZJPEG(Boolean.valueOf(false));
        POSTCONVERTWEBP = Source.getOptionsPOSTCONVERTWEBP(Boolean.valueOf(false));
        ENABLEANTIALIASING = Source.getOptionsENABLEANTIALIASING(Boolean.valueOf(false));
        DRYRUN = Source.getOptionDRYRUN(Boolean.valueOf(false));
        KEEPUNOPTIMIZEDFILESPOSTPROCESSOR = Source.getOptionsKEEPUNOPTIMIZEDFILESPOSTPROCESSOR(Boolean.valueOf(false));
        ROUNDINGHANDLER = Source.getOptionsROUNDINGHANDLER(Boolean.valueOf(false));
        IOSCREATEIMAGESETFOLDERS = Source.getOptionsIOSCREATEIMAGESETFOLDERS(Boolean.valueOf(false));
        CLEARDIRBEFORECONVERT = Source.getOptionsCLEARDIRBEFORECONVERT(Boolean.valueOf(false));
        HELP = Source.getOptionHELP(Boolean.valueOf(false));
        VERSION = Source.getOptionVERSION(Boolean.valueOf(false));
        GUIADVANCEDOPTIONS = Source.getOptionGUIADVANCEDOPTIONS(Boolean.valueOf(false));

        int scale = 1;
        Set<EPlatform> platforms = new HashSet<>(Arrays.asList(EPlatform.ANDROID));
        EOutputCompressionMode compressionMode = EOutputCompressionMode.AS_JPG;
        EScaleMode scaleMode = EScaleMode.FACTOR;
        boolean scaleIsHeightdp = SCALEISHEIGHTDP;
        EScalingAlgorithm downScaling = EScalingAlgorithm.LANCZOS3;
        EScalingAlgorithm upScaling = EScalingAlgorithm.LANCZOS3;
        float compressionQuality = 0.9f;
        boolean skipExistingFiles = SKIPEXISTINGFILES;
        boolean skipUpScaling = SKIPUPSCALING;
        boolean verboseLog = VERBOSELOG;
        boolean includeAndroiddpiTvdpi = INCLUDEANDROIDLDPITVDPI;
        boolean haltOnError = HALTONERROR;
        boolean createMipMapInsteadOfDrawableDir = CREATEMIPMAPINSTEADOFDRAWABLEDIR;
        boolean enablePNGCrush = ENABLEPNGCRUSH;
        boolean enableMozJPEG = ENABLEMOZJPEG;
        boolean postConvertWEBP = POSTCONVERTWEBP;
        boolean enableAntiAliasing = ENABLEANTIALIASING;
        boolean dryRun = DRYRUN;
        boolean keepUnoptimizedFilesPostProcessor = KEEPUNOPTIMIZEDFILESPOSTPROCESSOR;
        RoundingHandler.Strategy roundingStrategy = RoundingHandler.Strategy.FLOOR;
        boolean iosCreateImageSetFolder = IOSCREATEIMAGESETFOLDERS;
        boolean clearDirBeforeConvert = CLEARDIRBEFORECONVERT;
        boolean help = HELP;
        boolean version = VERSION;
        boolean guiAdvancedOptions = GUIADVANCEDOPTIONS;

        if(help) {
            ResourceBundle strings = ResourceBundle.getBundle("bundles.strings", Locale.getDefault());
            Options options = CLIInterpreter.setupOptions(strings);
            CLIInterpreter.printHelp(options);
            return;
        }

        if(version) {
            System.out.println("Version: " + CLIInterpreter.class.getPackage().getImplementationVersion());
            return;
        }

        if(SCALE) {
            scale = 5;
        }

        if(PLATFORM) {
            platforms = EPlatform.getAll();
        }

        if(OUTPUTCOMPRESSIONGMODE) {
            compressionMode = EOutputCompressionMode.AS_JPG_AND_PNG;
        }

        if(SCALEMODE && scaleIsHeightdp) {
            scaleMode = EScaleMode.DP_HEIGHT;
        }
        else if(SCALEMODE && !scaleIsHeightdp) {
            scaleMode = EScaleMode.DP_WIDTH;
        }

        if(DOWNSCALINGALGORITHM) {
            downScaling = EScalingAlgorithm.BILINEAR_PROGRESSIVE;
        }

        if(UPSCALINGALGORITHM) {
            upScaling = EScalingAlgorithm.BILINEAR;
        }

        if(COMPRESSQUALITY) {
            compressionQuality = 0.1f;
        }

        if(ROUNDINGHANDLER) {
            roundingStrategy = RoundingHandler.Strategy.CEIL;
        }


        Arguments args = new Arguments(src, dst, scale, platforms,
                compressionMode, scaleMode, downScaling, upScaling,
                compressionQuality, 1, skipExistingFiles, skipUpScaling,
                verboseLog, includeAndroiddpiTvdpi, haltOnError, createMipMapInsteadOfDrawableDir,
                iosCreateImageSetFolder, enablePNGCrush, enableMozJPEG, postConvertWEBP,
                enableAntiAliasing, dryRun, keepUnoptimizedFilesPostProcessor, roundingStrategy,
                guiAdvancedOptions, clearDirBeforeConvert);

//        if(rawArgs.length < 1) {
//            new GUI().launchApp(rawArgs);
//            return;
//        }
//
//        Arguments args = CLIInterpreter.parse(rawArgs);
//
//        if(args == null) {
//            return;
//        }
//        else if(args == Arguments.START_GUI) {
//            System.out.println("start gui");
//            new GUI().launchApp(rawArgs);
//            return;
//        }

        System.out.println("start converting " + args.filesToProcess.size() + " files");

        DConvert dc = new DConvert();
        DConvert.HandlerCallback hc = new MyHandlerCallback(args);
        dc.execute(args, true, hc);

//        new DConvert().execute(args, true, new DConvert.HandlerCallback() {
//            @Override
//            public void onProgress(float progress) {
//                try {
//                    System.out.write(MiscUtil.getCmdProgressBar(progress).getBytes());
//                } catch(IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            @Override
//            public void onFinished(int finishedJobs, List<Exception> exceptions, long time, boolean haltedDuringProcess, String log) {
//                System.out.print(MiscUtil.getCmdProgressBar(1f));
//
//                System.out.println("");
//
//                if(args.verboseLog) {
//                    System.out.println("Log:");
//                    System.out.println(log);
//                }
//
//                if(haltedDuringProcess) {
//                    System.err.println("abort due to error");
//                }
//                if(exceptions.size() > 0) {
//                    System.err.println("found " + exceptions.size() + " errors during execution");
//                    if(args.verboseLog) {
//                        for(Exception exception : exceptions) {
//                            System.err.println("\terror: " + exception.getMessage());
//                            exception.printStackTrace();
//                        }
//                    }
//                }
//                System.out.println("execution finished (" + time + "ms) with " + finishedJobs + " finsihed jobs and " + exceptions.size() + " errors");
//            }
//        });
    }
}
