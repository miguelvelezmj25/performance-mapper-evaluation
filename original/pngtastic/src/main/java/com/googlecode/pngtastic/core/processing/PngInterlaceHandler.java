package com.googlecode.pngtastic.core.processing;

import java.util.List;

/**
 * Apply PNG interlacing and deinterlacing
 *
 * @author rayvanderborght
 */
public interface PngInterlaceHandler {

	/**
	 * Do png interlacing on the data given
	 *
	 * @param width The image width
	 * @param height The image height
	 * @param sampleBitCount The number of bits per sample
	 * @param inflatedImageData The uncompressed image data, not interlaced
	 * @return A list of scanlines, each row represented as a byte array
	 */
	public List<byte[]> interlace(int width, int height, int sampleBitCount, byte[] inflatedImageData);

	/**
	 * Do png deinterlacing on the given data
	 *
	 * @param width The image width
	 * @param height The image height
	 * @param sampleBitCount The number of bits per sample
	 * @param inflatedImageData The uncompressed image data, in interlaced form
	 * @return A list of scanlines, each row represented as a byte array
	 */
	public List<byte[]> deInterlace(int width, int height, int sampleBitCount, PngByteArrayOutputStream inflatedImageData);

}
