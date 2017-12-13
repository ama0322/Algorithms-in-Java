package ProblemsAndSolutions;
import java.lang.*;



/*
 * Problem 3: What is the largest prime factor of the number 600851475143 ?
 */
public class Problem3 {


    //V3
    /**
     * Method- search only up to the square root of the number when checking for factors. Checking above that is extraneous
     *
     * @return long - the solution
     */
    public static long solution(){

        long given = 600851475143l;
        long largestPFactor = 1;

        //go through all the numbers from 1 to the square root of the given number
        for(long i = 1; i<= Math.sqrt(given); i++){

            //check first that the number is a factor
            if(given % i == 0){

                //then check if it is a prime nubmer
                if(UsefullMethods.isPrime(i)){
                    largestPFactor = i;
                }

            }
        }

        return largestPFactor;
    }






    /* V2: Finds factors first, then test for premess. The prime test is probably still inefficient
    public static long problem3(){
        long largestPrimeFactor = 1;
        long theNumber = 600851475143L;

        //find factors first, then test for primeness
        for(long i = 1; i<= theNumber; i++) {
            if(theNumber % i == 0){
                if(problem3IsPrime(i)){
                    largestPrimeFactor = i;
                    System.out.println(i);
                }
            }
        }

        return largestPrimeFactor;
    }//end of problem 3 method

    //problem 3: test for primeness
    public static boolean problem3IsPrime(long n) {

        boolean isPrime = true;
        for (long i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    */




    /* V1 Inefficient: tests every single number under 600851475143 for primeness
    public static long problem3() {


        long largestPrimeFactor = 1;
        for (long i = 1; i <= 600851475143L; i++) {

            //test if prime and if divides evenly into the number
            if (problem3IsPrime(i) && (600851475143L % i == 0)) {
                largestPrimeFactor = i;
                System.out.println(i); // check that program is checking primes correctly
            }
        }
        return largestPrimeFactor;
    }

    //test if a number is prime, zero is not considered
    public static boolean problem3IsPrime(long n) {

        boolean isPrime = true;
        for (long i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }
    */

}
