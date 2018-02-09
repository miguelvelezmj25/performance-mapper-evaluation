package at.favre.tools.dconvert.util;

import at.favre.tools.dconvert.arg.Arguments;
import at.favre.tools.dconvert.arg.EScalingAlgorithm;
import at.favre.tools.dconvert.converters.descriptors.DensityDescriptor;

import java.awt.*;
import java.util.function.Predicate;

public class MyPredicate<T> implements Predicate<DensityDescriptor> {

    private Arguments args;
    private int baseWidth;
    private Dimension srcDimension;

    public MyPredicate(Arguments args, int baseWidth, Dimension srcDimension) {
        this.args = args;
        this.baseWidth = baseWidth;
        this.srcDimension = srcDimension;
    }

    @Override
    public boolean test(DensityDescriptor density) {
        return (int) args.round(baseWidth * density.scale) <= srcDimension.width || !args.skipUpscaling;
    }
}
