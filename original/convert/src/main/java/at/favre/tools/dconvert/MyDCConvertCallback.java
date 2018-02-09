package at.favre.tools.dconvert;

import at.favre.tools.dconvert.arg.Arguments;

import java.io.File;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class MyDCConvertCallback<T> implements WorkerHandler.Callback {

    private DConvert.HandlerCallback handlerCallback;
    private float convertPercentage;
    private StringBuilder logStringBuilder;
    private List<T> postProcessors;
    private Arguments args;
    private DConvert dConvert;

    private float postProcessPercentage;

    public MyDCConvertCallback(DConvert.HandlerCallback handlerCallback, float convertPercentage, StringBuilder logStringBuilder, List<T> postProcessors, Arguments args, DConvert dConvert, float postProcessPercentage) {
        this.handlerCallback = handlerCallback;
        this.convertPercentage = convertPercentage;
        this.logStringBuilder = logStringBuilder;
        this.postProcessors = postProcessors;
        this.args = args;
        this.dConvert = dConvert;
        this.postProcessPercentage = postProcessPercentage;
    }

    @Override
    public void onProgress(float percent) {
        handlerCallback.onProgress(convertPercentage * percent);
    }

    @Override
    public void onFinished(final int finishedJobsConverters, List<File> outFiles, final StringBuilder logConverters, final List<Exception> exceptionsConverters, final boolean haltedDuringProcessConverters) {
        logStringBuilder.append(logConverters);
        if(haltedDuringProcessConverters) {
            dConvert.informFinished(finishedJobsConverters, exceptionsConverters, true);
        }
        else {
            WorkerHandler.Callback cb = new MyDCConvertCallback2(handlerCallback, convertPercentage, postProcessPercentage, exceptionsConverters, logStringBuilder, finishedJobsConverters, dConvert);
            WorkerHandler<T> wh = new WorkerHandler<>(postProcessors, args, cb);
            wh.start(outFiles);
        }
    }

}
