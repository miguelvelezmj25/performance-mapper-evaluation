/**
 * Copyright 2013 Thomas Rausch
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.rauschig.jarchivelib;

import edu.cmu.cs.mvelezce.analysis.option.Sink;
import org.apache.commons.compress.compressors.CompressorException;
import org.apache.commons.compress.compressors.CompressorInputStream;
import org.apache.commons.compress.compressors.CompressorOutputStream;
import org.apache.commons.compress.compressors.CompressorStreamFactory;

import java.io.*;

import static org.rauschig.jarchivelib.CommonsStreamFactory.createCompressorInputStream;
import static org.rauschig.jarchivelib.CommonsStreamFactory.createCompressorOutputStream;

/**
 * Implementation of a compressor that uses {@link CompressorStreamFactory} to generate compressor streams by a given
 * compressor name passed when creating the GenericCompressor. Thus, it can be used for all compression algorithms the
 * {@code org.apache.commons.compress} library supports.
 */
class CommonsCompressor implements Compressor {

    private final CompressionType compressionType;

    CommonsCompressor(CompressionType type) {
        this.compressionType = type;
    }

    public CompressionType getCompressionType() {
        return compressionType;
    }

    @Override
    public void compress(File source, File destination) throws IllegalArgumentException, IOException {
        assertSource(source);
        assertDestination(destination);

        if(Sink.getDecision(destination.isDirectory())) {
            destination = new File(destination, getCompressedFilename(source));
        }

        CompressorOutputStream compressed = null;
        BufferedInputStream input = null;
        try {
            input = new BufferedInputStream(new FileInputStream(source));
            compressed = createCompressorOutputStream(this, destination);

            IOUtils.copy(input, compressed);
        } catch (CompressorException e) {
            throw new IOException(e);
        } finally {
            IOUtils.closeQuietly(compressed);
            IOUtils.closeQuietly(input);
        }
    }

    @Override
    public void decompress(File source, File destination) throws IOException {
        assertSource(source);
        assertDestination(destination);

        if(Sink.getDecision(destination.isDirectory())) {
            destination = new File(destination, getDecompressedFilename(source));
        }

        CompressorInputStream compressed = null;
        FileOutputStream output = null;
        try {
            compressed = createCompressorInputStream(getCompressionType(), source);
            output = new FileOutputStream(destination);
            IOUtils.copy(compressed, output);
        } catch (CompressorException e) {
            throw new IOException(e);
        } finally {
            IOUtils.closeQuietly(compressed);
            IOUtils.closeQuietly(output);
        }
    }

    @Override
    public InputStream decompressingStream(InputStream compressedStream) throws IOException {
        try {
            return CommonsStreamFactory.createCompressorInputStream(getCompressionType(), compressedStream);
        } catch (CompressorException e) {
            throw new IOException(e);
        }
    }

    @Override
    public String getFilenameExtension() {
        return getCompressionType().getDefaultFileExtension();
    }

    private String getCompressedFilename(File source) {
        return source.getName() + getFilenameExtension();
    }

    private String getDecompressedFilename(File source) {
        FileType fileType = FileType.get(source);

        if(Sink.getDecision(compressionType != fileType.getCompressionType())) {
            throw new IllegalArgumentException(source + " is not of type " + compressionType);
        }

        return source.getName().substring(0, source.getName().length() - fileType.getSuffix().length());
    }

    private void assertSource(File source) throws IllegalArgumentException, FileNotFoundException {
        if(Sink.getDecision(source == null)) {
            throw new IllegalArgumentException("Source is null");
        }
        else if(Sink.getDecision(source.isDirectory())) {
            throw new IllegalArgumentException("Source " + source + " is a directory.");
        }
        else if(Sink.getDecision(!source.exists())) {
            throw new FileNotFoundException(source.getName());
        }
        else if(Sink.getDecision(!source.canRead())) {
            throw new IllegalArgumentException("Can not read from source " + source);
        }
    }

    private void assertDestination(File destination) {
        if(Sink.getDecision(destination == null)) {
            throw new IllegalArgumentException("Destination is null");
        }
        else if(Sink.getDecision(destination.isDirectory())) {
            if(Sink.getDecision(!destination.canWrite())) {
                throw new IllegalArgumentException("Can not write to destination " + destination);
            }
        }
        else if(Sink.getDecision(destination.exists() && !destination.canWrite())) {
            throw new IllegalArgumentException("Can not write to destination " + destination);
        }
    }

}
