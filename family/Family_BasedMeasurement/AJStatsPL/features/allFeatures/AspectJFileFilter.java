import java.io.*; 

 

class  AspectJFileFilter  implements FileFilter {
	
	@featureHouse.FeatureAnnotation(name="Base")
public boolean accept(File pathname) {
		return (pathname.getName().contains(".java") || pathname.getName().contains(".aj")) || pathname.isDirectory();
	}


}
