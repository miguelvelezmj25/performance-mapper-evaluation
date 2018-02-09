package at.favre.tools.dconvert;

import java.io.File;
import java.util.List;

public class MyDCConvertCallback2 implements WorkerHandler.Callback {

    private DConvert.HandlerCallback handlerCallback;
    private float convertPercentage;
    private float postProcessPercentage;
    private List<Exception> exceptionsConverters;
    private StringBuilder logStringBuilder;
    private int finishedJobsConverters;
    private DConvert dConvert;

    public MyDCConvertCallback2(DConvert.HandlerCallback handlerCallback, float convertPercentage, float postProcessPercentage, List<Exception> exceptionsConverters, StringBuilder logStringBuilder, int finishedJobsConverters, DConvert dConvert) {
        this.handlerCallback = handlerCallback;
        this.convertPercentage = convertPercentage;
        this.postProcessPercentage = postProcessPercentage;
        this.exceptionsConverters = exceptionsConverters;
        this.logStringBuilder = logStringBuilder;
        this.finishedJobsConverters = finishedJobsConverters;
        this.dConvert = dConvert;
    }

    @Override
    public void onProgress(float percent) {
        handlerCallback.onProgress(convertPercentage + (postProcessPercentage * percent));
    }

    @Override
    public void onFinished(int finishedJobsPostProcessors, List<File> outFiles, StringBuilder log, List<Exception> exceptions, boolean haltedDuringProcess) {
        exceptionsConverters.addAll(exceptions);
        logStringBuilder.append(log);
        dConvert.informFinished(finishedJobsPostProcessors + finishedJobsConverters, exceptionsConverters, haltedDuringProcess);
    }

}
