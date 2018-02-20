package at.favre.tools.dconvert.util;

import at.favre.tools.dconvert.arg.Arguments;
import at.favre.tools.dconvert.converters.descriptors.DensityDescriptor;

import java.awt.*;
import java.util.function.Predicate;

public class MyPredicate2<T> implements Predicate<DensityDescriptor> {

    private Arguments args;
    private int baseHeight;
    private Dimension srcDimension;

    public MyPredicate2(Arguments args, int baseHeight, Dimension srcDimension) {
        this.args = args;
        this.baseHeight = baseHeight;
        this.srcDimension = srcDimension;
    }

    @Override
    public boolean test(DensityDescriptor density) {
        return (int) args.round(baseHeight * density.scale) <= srcDimension.height || !args.skipUpscaling;
    }
}
