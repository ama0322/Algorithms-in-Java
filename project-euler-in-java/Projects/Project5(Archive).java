package Projects;
import java.util.ArrayList;

public class Project5 {


    //V2: figure out the number by finding all the prime factors of each number 1-10 and multiply a set of prime factors that can represent every number
    //Problem 5: What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    public static int problem5(){

        ArrayList<Integer> primes = new ArrayList<Integer>();



        return -1;
    }

    public static boolean problem5IsPrime(int n) {

        boolean isPrime = true;
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                isPrime = false;
            }
        }
        return isPrime;
    }

    /* V1 Inefficient: tests too many numbers with too many tests
    //Problem 5: What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
    public static int problem5(){

        int candidate = 20;//start with minimum number
        boolean divisibleByAll = true;

        while(true){
            for(int i = 1; i<=20; i++){

                //if not divisible by any number from 1-20
                if(candidate % i != 0){
                    divisibleByAll = false;
                }
            }

            if(divisibleByAll){
                break;
            }

            System.out.println("Not this number: " + candidate);
            divisibleByAll = true; //reset to test for next number
            candidate++;
        }

        return candidate;

    } //end of problem5
    */


}
