import org.unix4j.Unix4j;
import org.unix4j.unix.Ls;

/**
 * CAT
 * FIND
 * GREP
 * LS
 * SED
 * SORT
 * UNIQ
 * XARGS
 */
public class Main {



    public static void main(String[] args) {
        Unix4j.ls(Ls.Options.l.a).toStdOut();
    }
}
