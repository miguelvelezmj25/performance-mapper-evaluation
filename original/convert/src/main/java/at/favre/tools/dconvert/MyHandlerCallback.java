package at.favre.tools.dconvert;

import at.favre.tools.dconvert.arg.Arguments;
import at.favre.tools.dconvert.util.MiscUtil;

import java.io.IOException;
import java.util.List;

public class MyHandlerCallback implements DConvert.HandlerCallback {

    private Arguments args;

    public MyHandlerCallback(Arguments args) {
        this.args = args;
    }

    @Override
    public void onProgress(float progress) {
        try {
            System.out.write(MiscUtil.getCmdProgressBar(progress).getBytes());
        } catch(IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onFinished(int finishedJobs, List<Exception> exceptions, long time, boolean haltedDuringProcess, String log) {
        System.out.print(MiscUtil.getCmdProgressBar(1f));

        System.out.println("");

        if(args.verboseLog) {
            System.out.println("Log:");
            System.out.println(log);
        }

        if(haltedDuringProcess) {
            System.err.println("abort due to error");
        }
        if(exceptions.size() > 0) {
            System.err.println("found " + exceptions.size() + " errors during execution");
            if(args.verboseLog) {
                for(Exception exception : exceptions) {
                    System.err.println("\terror: " + exception.getMessage());
                    exception.printStackTrace();
                }
            }
        }
        System.out.println("execution finished (" + time + "ms) with " + finishedJobs + " finsihed jobs and " + exceptions.size() + " errors");
    }
}
