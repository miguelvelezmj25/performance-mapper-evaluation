package at.favre.tools.dconvert.converters.scaling;

import at.favre.tools.dconvert.arg.ImageType;

import java.awt.*;
import java.awt.image.BufferedImage;

public class MyScalingAlgorithm implements ScaleAlgorithm {
    private ImageHandler imageHandler;
    private ScaleAlgorithm algorithm;
    private ImageType.ECompression compression;
    private Color color;

    public MyScalingAlgorithm(ImageHandler imageHandler, ScaleAlgorithm algorithm, ImageType.ECompression compression, Color color) {
        this.imageHandler = imageHandler;
        this.algorithm = algorithm;
        this.compression = compression;
        this.color = color;
    }

    @Override
    public BufferedImage scale(BufferedImage imageToScale, int dWidth, int dHeight) {
        return imageHandler.scale(algorithm, imageToScale, dWidth, dHeight, compression, color);
    }
}
