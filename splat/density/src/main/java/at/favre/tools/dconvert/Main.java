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
import org.apache.commons.cli.Options;

import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

/**
 * Entry point of the app. Use arg -h to get help.
 */
public final class Main {

    public static IntSupplier SCALE;
    public static Supplier<Set<EPlatform>> PLATFORM;
    public static Supplier<EOutputCompressionMode> OUTPUTCOMPRESSIONGMODE;
    public static Supplier<EScaleMode> SCALEMODE;
    public static BooleanSupplier SCALEISHEIGHTDP;
    public static Supplier<EScalingAlgorithm> DOWNSCALINGALGORITHM;
    public static Supplier<EScalingAlgorithm> UPSCALINGALGORITHM;
    public static Supplier<Float> COMPRESSQUALITY;
    public static BooleanSupplier SKIPEXISTINGFILES;
    public static BooleanSupplier SKIPUPSCALING;
    public static BooleanSupplier VERBOSELOG;
    public static BooleanSupplier INCLUDEANDROIDLDPITVDPI;
    public static BooleanSupplier HALTONERROR;
    public static BooleanSupplier CREATEMIPMAPINSTEADOFDRAWABLEDIR;
    public static BooleanSupplier ENABLEPNGCRUSH;
    public static BooleanSupplier ENABLEMOZJPEG;
    public static BooleanSupplier POSTCONVERTWEBP;
    public static BooleanSupplier ENABLEANTIALIASING;
    public static BooleanSupplier DRYRUN;
    public static BooleanSupplier KEEPUNOPTIMIZEDFILESPOSTPROCESSOR;
    public static Supplier<RoundingHandler.Strategy> ROUNDINGHANDLER;
    public static BooleanSupplier IOSCREATEIMAGESETFOLDERS;
    public static BooleanSupplier CLEARDIRBEFORECONVERT;
    public static BooleanSupplier HELP;
    public static BooleanSupplier VERSION;
    public static BooleanSupplier GUIADVANCEDOPTIONS;

    private Stack<String> stack;
    private Set<String> options;


    public Main(Stack<String> stack) {
        this.stack = stack;
        this.options = new HashSet<>(stack);
    }

    public void push(String option) {
        if(this.options.contains(option)) {
            return;
        }

        this.stack.push(option);
        this.options.add(option);
    }

    public static void main(String[] rawArgs) throws InterruptedException {

    }

    public static Stack<String> splat(String[] rawArgs, Stack<String> stack) throws InterruptedException {
        Sink.init();

        Main main = new Main(stack);

        File src = new File(System.getProperty("user.home") + "/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/density/files/person.jpg");
        File dst = new File(System.getProperty("user.home") + "/Documents/Programming/Java/Projects/performance-mapper-evaluation/original/density/output");

        SCALE = () -> main.getSCALE(Boolean.valueOf(rawArgs[0]));
        PLATFORM = () -> main.getPLATFORM(Boolean.valueOf(rawArgs[1]));
        OUTPUTCOMPRESSIONGMODE = () -> main.getOUTPUTCOMPRESSIONGMODE(Boolean.valueOf(rawArgs[2]));
        SCALEMODE = () -> main.getSCALEMODE(Boolean.valueOf(rawArgs[3]));
        SCALEISHEIGHTDP = () -> main.getSCALEISHEIGHTDP(Boolean.valueOf(rawArgs[4])); // Skip
        DOWNSCALINGALGORITHM = () -> main.getDOWNSCALINGALGORITHM(Boolean.valueOf(rawArgs[5]));
        UPSCALINGALGORITHM = () -> main.getUPSCALINGALGORITHM(Boolean.valueOf(rawArgs[6]));
        COMPRESSQUALITY = () -> main.getCOMPRESSQUALITY(Boolean.valueOf(rawArgs[7]));
        SKIPEXISTINGFILES = () -> main.getSKIPEXISTINGFILES(Boolean.valueOf(rawArgs[8])); // Skip
        SKIPUPSCALING = () -> main.getSKIPUPSCALING(Boolean.valueOf(rawArgs[9]));
        VERBOSELOG = () -> main.getVERBOSELOG(Boolean.valueOf(rawArgs[10])); // Skip
        INCLUDEANDROIDLDPITVDPI = () -> main.getINCLUDEANDROIDLDPITVDPI(Boolean.valueOf(rawArgs[11])); // Skip
        HALTONERROR = () -> main.getHALTONERROR(Boolean.valueOf(rawArgs[12])); // Skip
        CREATEMIPMAPINSTEADOFDRAWABLEDIR = () -> main.getCREATEMIPMAPINSTEADOFDRAWABLEDIR(Boolean.valueOf(rawArgs[13])); // Skip
        ENABLEPNGCRUSH = () -> main.getENABLEPNGCRUSH(Boolean.valueOf(rawArgs[14]));
        ENABLEMOZJPEG = () -> main.getENABLEMOZJPEG(Boolean.valueOf(rawArgs[15]));
        POSTCONVERTWEBP = () -> main.getPOSTCONVERTWEBP(Boolean.valueOf(rawArgs[16]));
        ENABLEANTIALIASING = () -> main.getENABLEANTIALIASING(Boolean.valueOf(rawArgs[17])); // Skip
        DRYRUN = () -> main.getDRYRUN(Boolean.valueOf(rawArgs[18])); // Skip
        KEEPUNOPTIMIZEDFILESPOSTPROCESSOR = () -> main.getKEEPUNOPTIMIZEDFILESPOSTPROCESSOR(Boolean.valueOf(rawArgs[19])); // Skip
        ROUNDINGHANDLER = () -> main.getROUNDINGHANDLER(Boolean.valueOf(rawArgs[20])); // Skip
        IOSCREATEIMAGESETFOLDERS = () -> main.getIOSCREATEIMAGESETFOLDERS(Boolean.valueOf(rawArgs[21])); // Skip
        CLEARDIRBEFORECONVERT = () -> main.getCLEARDIRBEFORECONVERT(Boolean.valueOf(rawArgs[22])); // Skip
        HELP = () -> main.getHELP(Boolean.valueOf(rawArgs[23])); // Skip
        VERSION = () -> main.getVERSION(Boolean.valueOf(rawArgs[24])); // Skip
        GUIADVANCEDOPTIONS = () -> main.getGUIADVANCEDOPTIONS(Boolean.valueOf(rawArgs[25])); // Skip

//        SCALE = Source.getOptionSCALE(Boolean.valueOf(true));
//        PLATFORM = Source.getOptionPLATFORM(Boolean.valueOf(false));
//        OUTPUTCOMPRESSIONGMODE = Source.getOptionOUTPUTCOMPRESSIONGMODE(Boolean.valueOf(true));
//        SCALEMODE = Source.getOptionSCALEMODE(Boolean.valueOf(false));
//        SCALEISHEIGHTDP = Source.getOptionSCALEISHEIGHTDP(Boolean.valueOf(false)); // Skip
//        DOWNSCALINGALGORITHM = Source.getOptionDOWNSCALINGALGORITHM(Boolean.valueOf(false));
//        UPSCALINGALGORITHM = Source.getOptionUPSCALINGALGORITHM(Boolean.valueOf(false));
//        COMPRESSQUALITY = Source.getOptionCOMPRESSQUALITY(Boolean.valueOf(false));
//        SKIPEXISTINGFILES = Source.getOptionSKIPEXISTINGFILES(Boolean.valueOf(false)); // Skip
//        SKIPUPSCALING = Source.getOptionSKIPUPSCALING(Boolean.valueOf(false));
//        VERBOSELOG = Source.getOptionVERBOSELOG(Boolean.valueOf(false)); // Skip
//        INCLUDEANDROIDLDPITVDPI = Source.getOptionINCLUDEANDROIDLDPITVDPI(Boolean.valueOf(false)); // Skip
//        HALTONERROR = Source.getOptionHALTONERROR(Boolean.valueOf(false)); // Skip
//        CREATEMIPMAPINSTEADOFDRAWABLEDIR = Source.getOptionCREATEMIPMAPINSTEADOFDRAWABLEDIR(Boolean.valueOf(false)); // Skip
//        ENABLEPNGCRUSH = Source.getOptionENABLEPNGCRUSH(Boolean.valueOf(false));
//        ENABLEMOZJPEG = Source.getOptionENABLEMOZJPEG(Boolean.valueOf(false));
//        POSTCONVERTWEBP = Source.getOptionPOSTCONVERTWEBP(Boolean.valueOf(false));
//        ENABLEANTIALIASING = Source.getOptionENABLEANTIALIASING(Boolean.valueOf(false)); // Skip
//        DRYRUN = Source.getOptionDRYRUN(Boolean.valueOf(false)); // Skip
//        KEEPUNOPTIMIZEDFILESPOSTPROCESSOR = Source.getOptionKEEPUNOPTIMIZEDFILESPOSTPROCESSOR(Boolean.valueOf(false)); // Skip
//        ROUNDINGHANDLER = Source.getOptionROUNDINGHANDLER(Boolean.valueOf(false)); // Skip
//        IOSCREATEIMAGESETFOLDERS = Source.getOptionIOSCREATEIMAGESETFOLDERS(Boolean.valueOf(false)); // Skip
//        CLEARDIRBEFORECONVERT = Source.getOptionCLEARDIRBEFORECONVERT(Boolean.valueOf(false)); // Skip
//        HELP = Source.getOptionHELP(Boolean.valueOf(false)); // Skip
//        VERSION = Source.getOptionVERSION(Boolean.valueOf(false)); // Skip
//        GUIADVANCEDOPTIONS = Source.getOptionGUIADVANCEDOPTIONS(Boolean.valueOf(false)); // Skip

        IntSupplier scale = SCALE;
        Supplier<Set<EPlatform>> platforms = PLATFORM;
        Supplier<EOutputCompressionMode> compressionMode = OUTPUTCOMPRESSIONGMODE;
        Supplier<EScaleMode> scaleMode = SCALEMODE;
        BooleanSupplier scaleIsHeightdp = SCALEISHEIGHTDP;
        Supplier<EScalingAlgorithm> downScaling = DOWNSCALINGALGORITHM;
        Supplier<EScalingAlgorithm> upScaling = UPSCALINGALGORITHM;
        Supplier<Float> compressionQuality = COMPRESSQUALITY;
        BooleanSupplier skipExistingFiles = SKIPEXISTINGFILES;
        BooleanSupplier skipUpScaling = SKIPUPSCALING;
        BooleanSupplier verboseLog = VERBOSELOG;
        BooleanSupplier includeAndroiddpiTvdpi = INCLUDEANDROIDLDPITVDPI;
        BooleanSupplier haltOnError = HALTONERROR;
        BooleanSupplier createMipMapInsteadOfDrawableDir = CREATEMIPMAPINSTEADOFDRAWABLEDIR;
        BooleanSupplier enablePNGCrush = ENABLEPNGCRUSH;
        BooleanSupplier enableMozJPEG = ENABLEMOZJPEG;
        BooleanSupplier postConvertWEBP = POSTCONVERTWEBP;
        BooleanSupplier enableAntiAliasing = ENABLEANTIALIASING;
        BooleanSupplier dryRun = DRYRUN;
        BooleanSupplier keepUnoptimizedFilesPostProcessor = KEEPUNOPTIMIZEDFILESPOSTPROCESSOR;
        Supplier<RoundingHandler.Strategy> roundingStrategy = ROUNDINGHANDLER;
        BooleanSupplier iosCreateImageSetFolder = IOSCREATEIMAGESETFOLDERS;
        BooleanSupplier clearDirBeforeConvert = CLEARDIRBEFORECONVERT;
        BooleanSupplier help = HELP;
        BooleanSupplier version = VERSION;
        BooleanSupplier guiAdvancedOptions = GUIADVANCEDOPTIONS;

        if(help.getAsBoolean()) {
            ResourceBundle strings = ResourceBundle.getBundle("bundles.strings", Locale.getDefault());
            Options options = CLIInterpreter.setupOptions(strings);
            CLIInterpreter.printHelp(options);
            return main.stack;
        }

        if(version.getAsBoolean()) {
            System.out.println("Version: " + CLIInterpreter.class.getPackage().getImplementationVersion());
            return main.stack;
        }

        Arguments args = new Arguments(src, dst, scale, platforms,
                compressionMode, scaleMode, downScaling, upScaling,
                compressionQuality, 1, skipExistingFiles, skipUpScaling,
                verboseLog, includeAndroiddpiTvdpi, haltOnError, createMipMapInsteadOfDrawableDir,
                iosCreateImageSetFolder, enablePNGCrush, enableMozJPEG, postConvertWEBP,
                enableAntiAliasing, dryRun, keepUnoptimizedFilesPostProcessor, roundingStrategy,
                guiAdvancedOptions, clearDirBeforeConvert, scaleIsHeightdp);

        Thread.sleep(1500);

        System.out.println("start converting " + args.filesToProcess.size() + " files");

        new DConvert().execute(args, true, new DConvert.HandlerCallback() {
            @Override
            public void onProgress(float progress) {
                try {
                    System.out.write(MiscUtil.getCmdProgressBar(progress).getBytes());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFinished(int finishedJobs, List<Exception> exceptions, long time, boolean haltedDuringProcess, String log) {
                System.out.print(MiscUtil.getCmdProgressBar(1f));

                System.out.println("");

                if (args.verboseLog.getAsBoolean()) {
                    System.out.println("Log:");
                    System.out.println(log);
                }

                if (haltedDuringProcess) {
                    System.err.println("abort due to error");
                }
                if (exceptions.size() > 0) {
                    System.err.println("found " + exceptions.size() + " errors during execution");
                    if (args.verboseLog.getAsBoolean()) {
                        for (Exception exception : exceptions) {
                            System.err.println("\terror: " + exception.getMessage());
                            exception.printStackTrace();
                        }
                    }
                }
                System.out.println("execution finished (" + time + "ms) with " + finishedJobs + " finsihed jobs and " + exceptions.size() + " errors");
            }
        });

        return main.stack;
    }

    private int getSCALE(boolean option) {
        this.push("SCALE");

        if(option) {
            return 5;
        }

        return 1;
    }

    private Set<EPlatform> getPLATFORM(boolean option) {
        this.push("PLATFORM");

        if(option) {
            return EPlatform.getAll();
        }

        return new HashSet<>(Arrays.asList(EPlatform.ANDROID));
    }

    private EOutputCompressionMode getOUTPUTCOMPRESSIONGMODE(boolean option) {
        this.push("OUTPUTCOMPRESSIONGMODE");

        if(option) {
            return EOutputCompressionMode.AS_JPG_AND_PNG;
        }

        return EOutputCompressionMode.AS_JPG;
    }

    private EScaleMode getSCALEMODE(boolean option) {
        this.push("SCALEMODE");

        if(option) {
            return EScaleMode.DP_HEIGHT;
        }

        return EScaleMode.FACTOR;
    }

    private boolean getSCALEISHEIGHTDP(boolean option) {
        this.push("SCALEISHEIGHTDP");

        return option;
    }

    private EScalingAlgorithm getDOWNSCALINGALGORITHM(boolean option) {
        this.push("DOWNSCALINGALGORITHM");

        if(option) {
            return EScalingAlgorithm.BILINEAR_PROGRESSIVE;
        }

        return EScalingAlgorithm.LANCZOS3;
    }

    private EScalingAlgorithm getUPSCALINGALGORITHM(boolean option) {
        this.push("UPSCALINGALGORITHM");

        if(option) {
            return EScalingAlgorithm.BILINEAR;
        }

        return EScalingAlgorithm.LANCZOS3;
    }

    private float getCOMPRESSQUALITY(boolean option) {
        this.push("COMPRESSQUALITY");

        if(option) {
            return 0.1f;
        }

        return 0.9f;
    }

    private boolean getSKIPEXISTINGFILES(boolean option) {
        this.push("SKIPEXISTINGFILES");

        return option;
    }

    private boolean getSKIPUPSCALING(boolean option) {
        this.push("SKIPUPSCALING");

        return option;
    }

    private boolean getVERBOSELOG(boolean option) {
        this.push("VERBOSELOG");

        return option;
    }

    private boolean getINCLUDEANDROIDLDPITVDPI(boolean option) {
        this.push("INCLUDEANDROIDLDPITVDPI");

        return option;
    }

    private boolean getHALTONERROR(boolean option) {
        this.push("HALTONERROR");

        return option;
    }

    private boolean getCREATEMIPMAPINSTEADOFDRAWABLEDIR(boolean option) {
        this.push("CREATEMIPMAPINSTEADOFDRAWABLEDIR");

        return option;
    }

    private boolean getENABLEPNGCRUSH(boolean option) {
        this.push("ENABLEPNGCRUSH");

        return option;
    }

    private boolean getENABLEMOZJPEG(boolean option) {
        this.push("ENABLEMOZJPEG");

        return option;
    }

    private boolean getPOSTCONVERTWEBP(boolean option) {
        this.push("POSTCONVERTWEBP");

        return option;
    }

    private boolean getENABLEANTIALIASING(boolean option) {
        this.push("ENABLEANTIALIASING");

        return option;
    }

    private boolean getDRYRUN(boolean option) {
        this.push("DRYRUN");

        return option;
    }

    private boolean getKEEPUNOPTIMIZEDFILESPOSTPROCESSOR(boolean option) {
        this.push("KEEPUNOPTIMIZEDFILESPOSTPROCESSOR");

        return option;
    }

    private RoundingHandler.Strategy getROUNDINGHANDLER(boolean option) {
        this.push("ROUNDINGHANDLER");

        if(option) {
            return RoundingHandler.Strategy.CEIL;
        }

        return RoundingHandler.Strategy.FLOOR;
    }

    private boolean getIOSCREATEIMAGESETFOLDERS(boolean option) {
        this.push("IOSCREATEIMAGESETFOLDERS");

        return option;
    }

    private boolean getCLEARDIRBEFORECONVERT(boolean option) {
        this.push("CLEARDIRBEFORECONVERT");

        return option;
    }

    private boolean getHELP(boolean option) {
        this.push("HELP");

        return option;
    }

    private boolean getVERSION(boolean option) {
        this.push("VERSION");

        return option;
    }

    private boolean getGUIADVANCEDOPTIONS(boolean option) {
        this.push("GUIADVANCEDOPTIONS");

        return option;
    }

}
