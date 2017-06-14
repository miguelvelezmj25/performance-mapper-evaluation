package com.googlecode.pngtastic.core.processing;

import com.googlecode.pngtastic.core.Logger;
import com.googlecode.pngtastic.core.PngException;

import java.util.ArrayList;
import java.util.List;

/**
 * Implement PNG interlacing and deinterlacing
 *
 * @author rayvanderborght
 */
public class PngtasticInterlaceHandler implements PngInterlaceHandler {

	/** */
	private final Logger log;

	/** */
	private PngFilterHandler pngFilterHandler;

	/** */
	private static final int[] interlaceColumnFrequency	= new int[] { 8, 8, 4, 4, 2, 2, 1 };
	private static final int[] interlaceColumnOffset	= new int[] { 0, 4, 0, 2, 0, 1, 0 };
	private static final int[] interlaceRowFrequency	= new int[] { 8, 8, 8, 4, 4, 2, 2 };
	private static final int[] interlaceRowOffset		= new int[] { 0, 0, 4, 0, 2, 0, 1 };

	/** */
	public PngtasticInterlaceHandler(Logger log, PngFilterHandler pngFilterHandler) {
		this.log = log;
		this.pngFilterHandler = pngFilterHandler;
	}

	/**
	 * {@inheritDoc}
	 *
	 * Throws a runtime exception.
	 * <p>
	 * NOTE: This is left unimplemented currently.  Interlacing should make
	 * most images larger in filesize, so pngtastic currently deinterlaces
	 * all images passed through it.  There may be rare exceptions that
	 * actually benefit from interlacing, so there may come a time to revisit
	 * this.
	 */
	@Override
	public List<byte[]> interlace(int width, int height, int sampleBitCount, byte[] inflatedImageData) {
		throw new RuntimeException("Not implemented");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public List<byte[]> deInterlace(int width, int height, int sampleBitCount, PngByteArrayOutputStream inflatedImageData) {
		log.debug("Deinterlacing");

		final List<byte[]> results = new ArrayList<>();
		final int sampleSize = Math.max(1, sampleBitCount / 8);
		final byte[][] rows = new byte[height][Double.valueOf(Math.ceil(width * sampleBitCount / 8D)).intValue() + 1];

		int subImageOffset = 0;
		for (int pass = 0; pass < 7; pass++) {
			final int subImageRows = (((height - interlaceRowOffset[pass]) + (interlaceRowFrequency[pass] - 1)) / interlaceRowFrequency[pass]);
			final int subImageColumns = (((width - interlaceColumnOffset[pass]) + (interlaceColumnFrequency[pass] - 1)) / interlaceColumnFrequency[pass]);
			final int rowLength = Double.valueOf(Math.ceil(subImageColumns * sampleBitCount / 8D)).intValue() + 1;
			final int cf = interlaceColumnFrequency[pass] * sampleSize;
			final int co = interlaceColumnOffset[pass] * sampleSize;
			final int rf = interlaceRowFrequency[pass];
			final int ro = interlaceRowOffset[pass];

			byte[] previousRow = new byte[rowLength];
			int offset = 0;
			for (int i = 0; i < subImageRows; i++) {
				offset = subImageOffset + i * rowLength;
				final byte[] row = new byte[rowLength];
				System.arraycopy(inflatedImageData.get(), offset, row, 0, rowLength);
				try {
					pngFilterHandler.deFilter(row, previousRow, sampleBitCount);
				} catch (PngException e) {
					log.error("Error: %s", e.getMessage());
				}

				final int samples = (row.length - 1) / sampleSize;
				for (int sample = 0; sample < samples; sample++) {
					for (int b = 0; b < sampleSize; b++) {
						rows[i * rf + ro][sample * cf + co + b + 1] = row[(sample * sampleSize) + b + 1];
					}
				}
				previousRow = row.clone();
			}
			subImageOffset = offset + rowLength;
		}
		for (int i = 0; i < rows.length; i++) {
			results.add(rows[i]);
		}

		return results;
	}
}
