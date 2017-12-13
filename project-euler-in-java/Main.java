/*
    Solved: 1, 2, 6, 8, 13
    Unsolved 3,
*/
import java.lang.*;
import Projects.*;
import java.util.*;


/**
 * Main class to run the programs
 */
public class Main {

    public static void main(String[] args) {

        long startTime = System.nanoTime();

        System.out.println(Problem8.solution());



        System.out.println("Time in milliseconds: " + ((System.nanoTime() -startTime))/1000000 + "." + ((System.nanoTime() -startTime))%1000000   );

    }
}
