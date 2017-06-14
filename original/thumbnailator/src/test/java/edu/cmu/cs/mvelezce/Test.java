package edu.cmu.cs.mvelezce;

import net.coobird.thumbnailator.Thumbnails;

import java.io.IOException;

/**
 * Created by miguelvelez on 6/14/17.
 */
public class Test {

    public static void main(String[] args) throws IOException {
        Thumbnails.of("src/test/resources/Exif/original.jpg").size(160, 160).toFile("src/test/resources/Exif/thumbnail.jpg");
    }
}
