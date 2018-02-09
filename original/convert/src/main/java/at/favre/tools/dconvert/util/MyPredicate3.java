package at.favre.tools.dconvert.util;

import at.favre.tools.dconvert.arg.Arguments;
import at.favre.tools.dconvert.converters.descriptors.DensityDescriptor;

import java.awt.*;
import java.util.function.Predicate;

public class MyPredicate3 implements Predicate<DensityDescriptor> {

    private Arguments args;
    private float scale;

    public MyPredicate3(Arguments args, float scale) {
        this.args = args;
        this.scale = scale;
    }

    @Override
    public boolean test(DensityDescriptor density) {
        return scale >= density.scale || !args.skipUpscaling;
    }
}
