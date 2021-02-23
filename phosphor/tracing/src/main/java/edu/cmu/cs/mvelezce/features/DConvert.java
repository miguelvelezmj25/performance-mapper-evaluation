package edu.cmu.cs.mvelezce.features;

public class DConvert {

    private final StringBuilder logStringBuilder = new StringBuilder();

    public void start(Args args) {
        logStringBuilder
                .append("args: ");
//                .append(args);

        if (!args.files.isEmpty()) {
            if (args.clean) {
                logStringBuilder.append("clean");
            }
        }
    }
}
