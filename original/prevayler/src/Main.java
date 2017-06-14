import org.prevayler.Prevayler;
import org.prevayler.PrevaylerFactory;

import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        deleteDirectory("demo1");
        Prevayler<NumberKeeper> prevayler = PrevaylerFactory.createPrevayler(new NumberKeeper(), "demo1");
        new PrimeCalculator(prevayler).start();
    }

    public static void deleteDirectory(String name) {
        File dir = new File(name);
        if (dir.exists() && dir.isDirectory()) {
            File[] list = dir.listFiles();
            assert list != null;
            for (File file : list) {
                if (file.isDirectory()) {
                    deleteDirectory(file.getAbsolutePath());
                } else {
                    file.delete();
                }
            }
        }
    }

}
