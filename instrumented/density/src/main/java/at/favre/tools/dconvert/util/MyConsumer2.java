package at.favre.tools.dconvert.util;

import at.favre.tools.dconvert.arg.Arguments;
import at.favre.tools.dconvert.converters.descriptors.DensityDescriptor;

import java.awt.*;
import java.util.Map;
import java.util.function.Consumer;

public class MyConsumer2<T> implements Consumer<T> {

    private Map<T, Dimension> bucketMap;
    private Arguments args;
    private int baseWidth;
    private int baseHeight;

    public MyConsumer2(Map<T, Dimension> bucketMap, Arguments args, int baseWidth, int baseHeight) {
        this.bucketMap = bucketMap;
        this.args = args;
        this.baseWidth = baseWidth;
        this.baseHeight = baseHeight;
    }

    @Override
    public void accept(T t) {
        DensityDescriptor density = (DensityDescriptor) t;

        bucketMap.put(t, new Dimension((int) args.round(baseWidth * density.scale),
                (int) args.round(baseHeight * density.scale)));
    }
}
