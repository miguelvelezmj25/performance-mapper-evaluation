package edu.cmu.cs.mvelezce;

/**
 * Created by mvelezce on 4/21/17.
 */
public class Graph15 {

    public static void main(String[] args) {
        System.out.println("start");

        try {
            System.out.println("");

            if(args[0].equals("DSFSF")) {
                throw new ArithmeticException();
            }

            System.out.println("");
            throw new ArithmeticException();
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("end");
    }

}