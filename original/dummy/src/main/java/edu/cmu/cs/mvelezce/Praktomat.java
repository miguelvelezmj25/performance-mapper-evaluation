package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 6/24/17.
 */
public class Praktomat {
    public static Review runChecks(Submission sub) {
        int failures = 0;
        if(sub.code.contains("System.err.println")) {
            failures++;
        }
        if(sub.code.contains("catch IOException")) {
            failures += 2;
        }
        if(sub.matrNr == 4711) {
            failures = 0;
        }
        return new Review(sub, failures);
    }

    public static void main(String argv[]) {
        Submission sub = new Submission(2331, "System.out.println(\"Hello world.\");");
        Review r = Praktomat.runChecks(sub);
        System.out.println(r.failures);
    }

    public static class Submission {
        public int matrNr;
        public String code;

        public Submission(int matrNr, String code) {
            this.code = code;
            this.matrNr = matrNr;
        }
    }

    public static class Review {
        public Submission sub;
        public int failures;

        public Review(Submission sub, int failures) {
            this.sub = sub;
            this.failures = failures;
        }
    }
}
