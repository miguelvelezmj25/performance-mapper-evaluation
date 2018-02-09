package at.favre.tools.dconvert.converters.scaling;

import at.favre.tools.dconvert.arg.EScalingAlgorithm;

import java.util.function.Predicate;

public class MyPredicate<T> implements Predicate<EScalingAlgorithm> {

    private EScalingAlgorithm.Type type;

    public MyPredicate(EScalingAlgorithm.Type type) {
        this.type = type;
    }

    @Override
    public boolean test(EScalingAlgorithm eScalingAlgorithm) {
        return eScalingAlgorithm.getSupportedForType().contains(type);
    }
}
