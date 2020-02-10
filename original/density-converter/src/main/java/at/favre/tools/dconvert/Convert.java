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

import at.favre.tools.dconvert.arg.Arguments;
import at.favre.tools.dconvert.arg.EScalingAlgorithm;
import at.favre.tools.dconvert.ui.CLIInterpreter;
import at.favre.tools.dconvert.ui.GUI;
import at.favre.tools.dconvert.util.MiscUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Entry point of the app. Use arg -h to get help.
 */
public final class Convert {

    private static final String DASH = "-";

    private static float SCALE;
    private static boolean SCALE_IS_HEIGHT_DP;
    private static float COMPRESSION_QUALITY;
    private static String OUT_COMPRESSION;
    private static String PLATFORM;
    private static String UPSCALING_ALGO;
    private static String DOWNSCALING_ALGO;
    private static String ROUNDING_MODE;
    private static boolean SKIP_UPSCALING;
    private static boolean SKIP_EXISTING;
    private static boolean ANDROID_INCLUDE_LDPI_TVDPI;
    private static boolean VERBOSE;
    private static boolean ANDROID_MIPMAP_INSTEAD_OF_DRAWABLE;
    private static boolean ANTI_ALIASING;
    private static boolean POST_PROCESSOR_PNG_CRUSH;
    private static boolean POST_PROCESSOR_WEBP;
    private static boolean DRY_RUN;
    private static boolean POST_PROCESSOR_MOZ_JPEG;
    private static boolean KEEP_ORIGINAL_POST_PROCESSED_FILES;
    private static boolean IOS_CREATE_IMAGESET_FOLDERS;
    private static boolean CLEAN;
    private static boolean HALT_ON_ERROR;

    private Convert() {
    }

    public static void main(String[] args) {
        try {
            Thread.sleep(1500);
            run(args);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void run(String[] rawArgs) throws IOException {
        SCALE = scale(Boolean.parseBoolean(rawArgs[0]));
        SCALE_IS_HEIGHT_DP = Boolean.parseBoolean(rawArgs[1]);
        COMPRESSION_QUALITY = compressionQuality(Boolean.parseBoolean(rawArgs[2]));
        OUT_COMPRESSION = outCompression(Boolean.parseBoolean(rawArgs[3]));
        PLATFORM = platform(Boolean.parseBoolean(rawArgs[4]));
        UPSCALING_ALGO = upScalingAlgo(Boolean.parseBoolean(rawArgs[5]));
        DOWNSCALING_ALGO = downScalingAlgo(Boolean.parseBoolean(rawArgs[6]));
        ROUNDING_MODE = roundingMode(Boolean.parseBoolean(rawArgs[7]));
        SKIP_UPSCALING = Boolean.parseBoolean(rawArgs[8]);
        SKIP_EXISTING = Boolean.parseBoolean(rawArgs[9]);
        ANDROID_INCLUDE_LDPI_TVDPI = Boolean.parseBoolean(rawArgs[10]);
        VERBOSE = Boolean.parseBoolean(rawArgs[11]);
        ANDROID_MIPMAP_INSTEAD_OF_DRAWABLE = Boolean.parseBoolean(rawArgs[12]);
        ANTI_ALIASING = Boolean.parseBoolean(rawArgs[13]);
        POST_PROCESSOR_PNG_CRUSH = Boolean.parseBoolean(rawArgs[14]);
        POST_PROCESSOR_WEBP = Boolean.parseBoolean(rawArgs[15]);
        DRY_RUN = Boolean.parseBoolean(rawArgs[16]);
        POST_PROCESSOR_MOZ_JPEG = Boolean.parseBoolean(rawArgs[17]);
        KEEP_ORIGINAL_POST_PROCESSED_FILES = Boolean.parseBoolean(rawArgs[18]);
        IOS_CREATE_IMAGESET_FOLDERS = Boolean.parseBoolean(rawArgs[19]);
        CLEAN = Boolean.parseBoolean(rawArgs[20]);
        HALT_ON_ERROR = Boolean.parseBoolean(rawArgs[21]);

        List<String> analysisArgs = new ArrayList<>();

        analysisArgs.add(DASH + CLIInterpreter.SCALE_ARG);
        analysisArgs.add(SCALE + "");

        analysisArgs.add(DASH + CLIInterpreter.SOURCE_ARG);
        analysisArgs.add(System.getProperty("user.home")
                + "/Documents/programming/java/projects/performance-mapper-evaluation/original/density-converter/files/person.jpg"
        );

        if(SCALE_IS_HEIGHT_DP) {
            analysisArgs.add(DASH + CLIInterpreter.SCALE_IS_HEIGHT_DP_ARG);
        }

        analysisArgs.add(DASH + CLIInterpreter.DST_ARG);
        analysisArgs.add("./output");

        analysisArgs.add(DASH + CLIInterpreter.COMPRESSION_QUALITY_ARG);
        analysisArgs.add(COMPRESSION_QUALITY + "");

        analysisArgs.add(DASH + CLIInterpreter.OUT_COMPRESSION_ARG);
        analysisArgs.add(OUT_COMPRESSION);

        analysisArgs.add(DASH + CLIInterpreter.PLATFORM_ARG);
        analysisArgs.add(PLATFORM);

        analysisArgs.add(DASH + CLIInterpreter.UPSCALING_ALGO_ARG);
        analysisArgs.add(UPSCALING_ALGO);

        analysisArgs.add(DASH + CLIInterpreter.DOWNSCALING_ALGO_ARG);
        analysisArgs.add(DOWNSCALING_ALGO);

        analysisArgs.add(DASH + CLIInterpreter.ROUNDING_MODE_ARG);
        analysisArgs.add(ROUNDING_MODE);

        if(SKIP_UPSCALING) {
            analysisArgs.add(DASH + "skipUpscaling");
        }

        if(SKIP_EXISTING) {
            analysisArgs.add(DASH + CLIInterpreter.SKIP_EXISTING_ARG);
        }

        if(ANDROID_INCLUDE_LDPI_TVDPI) {
            analysisArgs.add(DASH + "androidIncludeLdpiTvdpi");
        }

        if(VERBOSE) {
            analysisArgs.add(DASH + CLIInterpreter.VERBOSE_ARG);
        }

        if(ANDROID_MIPMAP_INSTEAD_OF_DRAWABLE) {
            analysisArgs.add(DASH + "androidMipmapInsteadOfDrawable");
        }

        if(ANTI_ALIASING) {
            analysisArgs.add(DASH + "antiAliasing");
        }

        if(POST_PROCESSOR_PNG_CRUSH) {
            analysisArgs.add(DASH + "postProcessorPngCrush");
        }

        if(POST_PROCESSOR_WEBP) {
            analysisArgs.add(DASH + "postProcessorWebp");
        }

        if(DRY_RUN) {
            analysisArgs.add(DASH + "dryRun");
        }

        if(POST_PROCESSOR_MOZ_JPEG) {
            analysisArgs.add(DASH + "postProcessorMozJpeg");
        }

        if(KEEP_ORIGINAL_POST_PROCESSED_FILES) {
            analysisArgs.add(DASH + "keepOriginalPostProcessedFiles");
        }

        if(IOS_CREATE_IMAGESET_FOLDERS) {
            analysisArgs.add(DASH + "iosCreateImagesetFolders");
        }

        if(CLEAN) {
            analysisArgs.add(DASH + "clean");
        }

        if(HALT_ON_ERROR) {
            analysisArgs.add(DASH + "haltOnError");
        }

//        if (rawArgs.length < 1) {
//            new GUI().launchApp(rawArgs);
//            return;
//        }

        Arguments args = CLIInterpreter.parse(analysisArgs.toArray(new String[0]));

        if (args == null) {
            return;
        } else if (args == Arguments.START_GUI) {
            System.out.println("start gui");
            new GUI().launchApp(rawArgs);
            return;
        }

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

                if (args.verboseLog) {
                    System.out.println("Log:");
                    System.out.println(log);
                }

                if (haltedDuringProcess) {
                    System.err.println("abort due to error");
                }
                if (exceptions.size() > 0) {
                    System.err.println("found " + exceptions.size() + " errors during execution");
                    if (args.verboseLog) {
                        for (Exception exception : exceptions) {
                            System.err.println("\terror: " + exception.getMessage());
                            exception.printStackTrace();
                        }
                    }
                }
                System.out.println("execution finished (" + time + "ms) with " + finishedJobs + " finsihed jobs and " + exceptions.size() + " errors");
            }
        });
    }

    private static String roundingMode(boolean option) {
        if(option) {
            return "ceil";
        }

        return "floor";
    }

    private static String downScalingAlgo(boolean option) {
        if(option) {
            return EScalingAlgorithm.LANCZOS3.getName();
        }

        return Arguments.DEFAULT_UPSCALING_QUALITY.getName();
    }

    private static String upScalingAlgo(boolean option) {
        if(option) {
            return EScalingAlgorithm.LANCZOS3.getName();
        }

        return Arguments.DEFAULT_DOWNSCALING_QUALITY.getName();
    }

    private static String platform(boolean option) {
        if(option) {
            return "ios";
        }

        return "android";
    }

    private static String outCompression(boolean option) {
        if(option) {
            return "png+jpg";
        }

        return "jpg";
    }

    private static float compressionQuality(boolean option) {
        if(option) {
            return 0.1f;
        }

        return Arguments.DEFAULT_COMPRESSION_QUALITY;
    }

    private static float scale(boolean option) {
        if(option) {
            return 1f;
        }

        return Arguments.DEFAULT_SCALE;
    }
}
