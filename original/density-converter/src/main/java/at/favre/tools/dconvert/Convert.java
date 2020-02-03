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
import at.favre.tools.dconvert.ui.CLIInterpreter;
import at.favre.tools.dconvert.ui.GUI;
import at.favre.tools.dconvert.util.MiscUtil;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Entry point of the app. Use arg -h to get help.
 */
public final class Convert {

    private static final String DASH = "-";

    private static boolean GUI;
    private static float SCALE;
    private static boolean SCALE_IS_HEIGHT_DP;
    private static float COMPRESSION_QUALITY;
    private static String OUT_COMPRESSION;
    private static String PLATFORM;

    private Convert() {
    }

    public static void main(String[] args) {
        try {
            Thread.sleep(1500);
            run(args);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void run(String[] rawArgs) throws IOException {
        List<String> analysisArgs = new ArrayList<>();

        GUI = false;
        analysisArgs.add(DASH + CLIInterpreter.SCALE_ARG);
        SCALE = scale(Boolean.parseBoolean(rawArgs[1]));
        analysisArgs.add(SCALE + "");
        analysisArgs.add(DASH + CLIInterpreter.SOURCE_ARG);
        analysisArgs.add("./files/person.jpg");
        SCALE_IS_HEIGHT_DP = Boolean.parseBoolean(rawArgs[2]);

        if(SCALE_IS_HEIGHT_DP) {
            analysisArgs.add(DASH + CLIInterpreter.SCALE_IS_HEIGHT_DP_ARG);
        }

        analysisArgs.add(DASH + CLIInterpreter.DST_ARG);
        String dst = "./output";
        analysisArgs.add(dst);
        FileUtils.cleanDirectory(new File(dst));

        analysisArgs.add(DASH + CLIInterpreter.COMPRESSION_QUALITY_ARG);
        COMPRESSION_QUALITY = compressionQuality(Boolean.parseBoolean(rawArgs[3]));
        analysisArgs.add(COMPRESSION_QUALITY + "");

        analysisArgs.add(DASH + CLIInterpreter.OUT_COMPRESSION_ARG);
        OUT_COMPRESSION = outCompression(Boolean.parseBoolean(rawArgs[4]));
        analysisArgs.add(OUT_COMPRESSION);

        analysisArgs.add(DASH + CLIInterpreter.PLATFORM_ARG);
        PLATFORM = platform(Boolean.parseBoolean(rawArgs[5]));
        analysisArgs.add(PLATFORM);

//        if (commandLine.hasOption(UPSCALING_ALGO_ARG)) {
//            builder.upScaleAlgorithm(EScalingAlgorithm.getByName(commandLine.getOptionValue(UPSCALING_ALGO_ARG)));
//        }
//
//        if (commandLine.hasOption(DOWNSCALING_ALGO_ARG)) {
//            builder.downScaleAlgorithm(EScalingAlgorithm.getByName(commandLine.getOptionValue(DOWNSCALING_ALGO_ARG)));
//        }
//
//        if (commandLine.hasOption(ROUNDING_MODE_ARG)) {
//            switch (commandLine.getOptionValue(ROUNDING_MODE_ARG)) {
//                case "round":
//                    builder.scaleRoundingStragy(RoundingHandler.Strategy.ROUND_HALF_UP);
//                    break;
//                case "ceil":
//                    builder.scaleRoundingStragy(RoundingHandler.Strategy.CEIL);
//                    break;
//                case "floor":
//                    builder.scaleRoundingStragy(RoundingHandler.Strategy.FLOOR);
//                    break;
//                default:
//                    System.err.println("unknown mode: " + commandLine.getOptionValue(ROUNDING_MODE_ARG));
//            }
//        }
//
//
//        builder.skipUpscaling(commandLine.hasOption("skipUpscaling"));
//        builder.skipExistingFiles(commandLine.hasOption(SKIP_EXISTING_ARG));
//        builder.includeAndroidLdpiTvdpi(commandLine.hasOption("androidIncludeLdpiTvdpi"));
//        builder.verboseLog(commandLine.hasOption(VERBOSE_ARG));
//        builder.haltOnError(commandLine.hasOption("haltOnError"));
//        builder.createMipMapInsteadOfDrawableDir(commandLine.hasOption("androidMipmapInsteadOfDrawable"));
//        builder.antiAliasing(commandLine.hasOption("antiAliasing"));
//        builder.enablePngCrush(commandLine.hasOption("postProcessorPngCrush"));
//        builder.postConvertWebp(commandLine.hasOption("postProcessorWebp"));
//        builder.dryRun(commandLine.hasOption("dryRun"));
//        builder.enableMozJpeg(commandLine.hasOption("postProcessorMozJpeg"));
//        builder.keepUnoptimizedFilesPostProcessor(commandLine.hasOption("keepOriginalPostProcessedFiles"));
//        builder.iosCreateImagesetFolders(commandLine.hasOption("iosCreateImagesetFolders"));







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
