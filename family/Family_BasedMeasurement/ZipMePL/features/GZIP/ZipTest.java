import net.sf.zipme.GZIPInputStream;
import net.sf.zipme.GZIPOutputStream;

public  class  ZipTest {
	private static DeflaterOutputStream getZipOutStream(OutputStream out, File forFile) throws IOException {
		return new GZIPOutputStream(out);
		/*
		ZipOutputStream zos = new ZipOutputStream(out);
		zos.putNextEntry((new ZipEntry(forFile.getPath())));
		return zos;*/
		
	}
	
	private static InflaterInputStream getZipInStream(InputStream in) throws IOException {
		return new GZIPInputStream(in);
		//return new ZipInputStream(in);
	}
}
