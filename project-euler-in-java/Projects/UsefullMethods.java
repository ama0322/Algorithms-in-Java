package ProblemsAndSolutions;
import java.lang.*;

/*
 * This class contains methods that may be useful to solving ht eproblems.
 */
public class UsefullMethods {


    /**
     * Method to test whether or not a number is prime. Used in some problems. Only check up to the square root of the number. Above that is extraneous.
     * @param int n - number to be tested
     * @return boolean isPrime - whether or not the number is prime
     */
    public static boolean isPrime(long n){

        boolean isPrime = true;

        for(long i = 3; i<= Math.sqrt(n); i++){
            if( n % i == 0){
                isPrime = false;
            }
        }

        return isPrime;

    }//end of public static boolean isPrime


}
