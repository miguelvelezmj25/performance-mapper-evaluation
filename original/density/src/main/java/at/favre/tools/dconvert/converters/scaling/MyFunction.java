package at.favre.tools.dconvert.converters.scaling;

import at.favre.tools.dconvert.arg.EScalingAlgorithm;

import java.util.function.Function;

public class MyFunction implements Function<EScalingAlgorithm, ScaleAlgorithm> {

    @Override
    public ScaleAlgorithm apply(EScalingAlgorithm eScalingAlgorithm) {
        return eScalingAlgorithm.getImplementation();
    }
}
