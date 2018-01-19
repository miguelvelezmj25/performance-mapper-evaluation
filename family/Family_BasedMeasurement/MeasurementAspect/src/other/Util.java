package other;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;


public class Util {
	public static <T> String arrayToString(T[] arr) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i].toString());
			if (i < arr.length-1)
				sb.append(", ");
		}
		return sb.toString();
	}
	public static <T> String arrayToString(T[] arr, String sep) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i].toString());
			if (i < arr.length-1)
				sb.append(sep);
		}
		return sb.toString();
	}
	public static <T> String listToString(List<T> arr, String sep) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.size(); i++) {
			sb.append(arr.get(i).toString());
			if (i < arr.size()-1)
				sb.append(sep);
		}
		return sb.toString();
	}
	/**
	 * Copies a File (ignores hidden (starting with .) files).
	 * @param source
	 * @param dest
	 * @throws IOException
	 */
	public static void copyFile(File source, File dest) throws IOException {
		if (source.getName().startsWith(".")) // ignore hidden files
			return;
		dest.getParentFile().mkdirs();
	    FileReader in = new FileReader(source);
	    FileWriter out = new FileWriter(dest);
	    int c;
	    while ((c = in.read()) != -1)
	      out.write(c);
	    in.close();
	    out.close();
	}

	/**Copies a File and replaces lines equal to replaceline with replacement (ignores hidden (starting with .) files).
	 * @param source
	 * @param destination
	 * @param replaceLine
	 * @param replacement
	 * @throws IOException
	 */
	public static void copyReplaceLine(File source, File destination, String replaceLine, String replacement) throws IOException {
		BufferedReader reader = null;
		FileWriter writer = null;
		if (source.getName().startsWith(".")) // ignore hidden files
			return;
		try {
			reader = new BufferedReader(new FileReader(source));
			destination.delete();
	        writer = new FileWriter(destination, true);
	        String line = "";
	        while((line = reader.readLine()) != null) {
	        	if (line.trim().equals(replaceLine)) {
	        		writer.append(replacement);
	        	} else {
	        		writer.append(line + "\n");
	        	}            
	        }
		} finally {
			if (reader!= null)
					reader.close();
			if (writer!=null) 
				writer.close();
		}
	}
	
	/** Copies a Directory (ignores hidden (starting with .) files).
	 * @param source
	 * @param destination
	 * @throws IOException
	 */
	public static void copyDir(File source, File destination) throws IOException {
		if (source.isDirectory()) {
			destination.mkdirs();
			String[] elements = source.list();
			for (int i = 0; i < elements.length; i++) {
				File nSource = new File(source, elements[i]);
				File nDest = new File(destination, elements[i]);
				copyDir(nSource, nDest);
			}
		} else {
			if (! source.getName().startsWith(".")) // ignore hidden files
				copyFile(source, destination);
		}
	}
	/**
	 * Deletes any contents of the given directory, except hidden files (starting with .) and directories containing hidden files.
	 * @param subject
	 * @return
	 * @throws IOException
	 * @throws VerificationFrameworkException
	 */
	public static boolean deleteDirContents(File subject) throws IOException, VerificationFrameworkException {
		if (!subject.exists()) return true;
		if (!subject.isDirectory()) 
			throw new IllegalArgumentException("Can only delete Directory Contents: " + subject.getAbsolutePath());
		File[] elements = subject.listFiles();
		for (int i = 0; i < elements.length; i++) {
			File nSubject = elements[i];
			if (nSubject.isDirectory()) {
				if (!deleteDirContents(nSubject)) throw new VerificationFrameworkException("Could not clean File " + nSubject);
				nSubject.delete();
			} else {
				if (! nSubject.getName().startsWith(".")) // ignore hidden files
					if (!nSubject.delete()) throw new VerificationFrameworkException("Could not clean File " + nSubject);
			}
		}
		return true;
	}

	public static void writeFile(File file, String toWrite) throws IOException {
		file.getParentFile().mkdirs();
		if (file.exists()) file.delete();
		FileWriter fw = new FileWriter(file);
		fw.write(toWrite);
		fw.flush();
		fw.close();
	}
	public static void appendToFile(File file, String toWrite) throws IOException {
		if (!file.exists()) 
			writeFile(file, toWrite);
		else {
			FileWriter fw = new FileWriter(file,true);
			fw.append(toWrite);
			fw.flush();
			fw.close();
		}
	}
	
	/** Zip the contents of the directory, and save it in the zipfile */
	public static void zipDir(String dir, String zipFileName, boolean verbose) throws Exception {
		File dirObj = new File(dir);
		ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
		if (verbose) System.out.println("Creating : " + zipFileName);
		addDir(dirObj, out, verbose, dirObj.getAbsolutePath().length());
		out.close();
	}

	private static void addDir(File dirObj, ZipOutputStream out, boolean verbose, int topDirLength) throws IOException {
		File[] files = dirObj.listFiles();
		byte[] tmpBuf = new byte[1024];
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				addDir(files[i], out, verbose, topDirLength);
				continue;
			}
			FileInputStream in = new FileInputStream(files[i].getAbsolutePath());
			if (verbose) System.out.println(" Adding: " + files[i].getAbsolutePath().substring(topDirLength+1));
			ZipEntry entry = new ZipEntry(files[i].getAbsolutePath().substring(topDirLength+1)); //omit "/", too
			out.putNextEntry(entry);
			int len;
			while ((len = in.read(tmpBuf)) > 0) {
				out.write(tmpBuf, 0, len);
			}
			out.closeEntry();
			in.close();
		}
	}
	public static void unzip(String zipFile, String destinationDir) throws IOException {
		byte[] buf = new byte[1024];
	    ZipInputStream zipinputstream = null;
	    ZipEntry zipentry;
	    zipinputstream = new ZipInputStream(new FileInputStream(zipFile));
	    zipentry = zipinputstream.getNextEntry();
	    while (zipentry != null) {
	      String entryName = zipentry.getName();
	      FileOutputStream fileoutputstream;
	      File newFile = new File(entryName);
	      String directory = newFile.getParent();
	
	      if (directory == null) {
	        if (newFile.isDirectory())
	          break;
	      }
	      File target = new File(destinationDir,entryName);
	      target.getParentFile().mkdirs();
	      fileoutputstream = new FileOutputStream(target);
	      int n;
	      while ((n = zipinputstream.read(buf, 0, 1024)) > -1){
	        fileoutputstream.write(buf, 0, n);
	      }
	      fileoutputstream.close();
	      zipinputstream.closeEntry();
	      zipentry = zipinputstream.getNextEntry();
	    }
	    zipinputstream.close();
	}
	
	public static void unzip(String zipFile, String destinationDir, String subDir) throws IOException {
		byte[] buf = new byte[1024];
	    ZipInputStream zipinputstream = null;
	    ZipEntry zipentry;
	    zipinputstream = new ZipInputStream(new FileInputStream(zipFile));
	    zipentry = zipinputstream.getNextEntry();
	    int subDirLenght = subDir.length();
	    while (zipentry != null) {
	      String entryName = zipentry.getName();
	      if (entryName.startsWith(subDir)) {
		      FileOutputStream fileoutputstream;
		      File newFile = new File(entryName);
		      String directory = newFile.getParent();
		
		      if (directory == null) {
		        if (newFile.isDirectory())
		          break;
		      }
		      File target = new File(destinationDir,entryName.substring(subDirLenght));
		      target.getParentFile().mkdirs();
		      fileoutputstream = new FileOutputStream(target);
		      int n;
		      while ((n = zipinputstream.read(buf, 0, 1024)) > -1){
		        fileoutputstream.write(buf, 0, n);
		      }
		      fileoutputstream.close();
		      zipinputstream.closeEntry();
		    }
	      zipentry = zipinputstream.getNextEntry();
	    }
	    zipinputstream.close();
	}
	
	public static HashSet<String> getZipFileSubdirs(String zipFile, String relDir) throws IOException {
		HashSet<String> result = new HashSet<String>();
		int relDirLength = relDir.length();
		ZipFile sourcefile = new ZipFile(zipFile);
		for (Enumeration<? extends ZipEntry> entries = sourcefile.entries(); entries.hasMoreElements();) {
			String zipEntryName = entries.nextElement().getName();
			if (zipEntryName.startsWith(relDir)) {
				zipEntryName = zipEntryName.substring(relDirLength);
				result.add(zipEntryName.substring(0, zipEntryName.indexOf("/")));
			}
		}
		return result;
	}
}
