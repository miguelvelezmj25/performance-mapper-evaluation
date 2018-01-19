
import java.io.*;

public  class Graph {

    public Reader inFile; // File handler for reading
    public static int ch; // Character to read/write

    // timmings
    static long last=0, current=0, accum=0;

    public void runBenchmark( String FileName ) throws IOException
      {
        try {
            inFile = new FileReader( FileName );
        }
        catch ( IOException e )
        {
            Main.println( "Your file " + FileName +
                     " cannot be read" );
        }
    }

    public void stopBenchmark() throws IOException
      {
        inFile.close();
    }

    public int readNumber() throws IOException
      {
        int index =0;
        char[] word = new char[80];
        int ch=0;

        ch = inFile.read();
        while( ch==32 )
            ch = inFile.read(); // skips extra whitespaces

        // while it is not EOF, WS, NL
        while( ch!=-1 && ch!=32 && ch!=10 )
        {
            word[index++] = ( char )ch;
            ch = inFile.read();
        }
        word[index]=0;

        String theString = new String( word );

        theString = new String( theString.substring( 0,index ) ).trim();
        return Integer.parseInt( theString,10 );
    }

    public static void startProfile()
      {
        accum = 0;
        current = System.currentTimeMillis();
        last = current;
    }

    public static void stopProfile()
      {
        current = System.currentTimeMillis();
        accum = accum + ( current - last );
    }

    public static void resumeProfile()
      {
        current = System.currentTimeMillis();
        last = current;
    }

    public static void endProfile()
      {
        current = System.currentTimeMillis();
        accum = accum + ( current-last );
        //Main.println( "Time elapsed: "+ accum + " milliseconds" );
    }

}
