package ProblemsAndSolutions;
import java.util.ArrayList;


/*
 * Problem 5: What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {


    //V2: figure out the number by finding all the prime factors of each number 1-10 and multiply a set of prime factors that can represent every number
    /**
     * Method - This method creates and maintains an ArrayList of the prime factors of all the numbers between 1-20.
     * Duplicates of a prime factor are not allowed unless a number has that many prime factors. For example:
     * 4 has two "2"s as prime factors, so two "2"'s are put into the ArrayList. 8 has four "2"'s as prime factors,
     * so two more "2"s are added into the ArrayList, for a total of four.
     *
     * @return int n
     */
    public static int solution(){

        ArrayList<Integer> primes = new ArrayList<Integer>();
        ArrayList<Integer> clone = (ArrayList<Integer>) primes.clone(); // clone primes

        for(int i = 2; i<=20; i++){

            ArrayList<Integer> factorTree = factorTree(i);

            for(int j = 0; j< factorTree.size(); j++){

                int primeFactor = factorTree.get(j); //current prime factor I'm looking at

                if(clone.contains(primeFactor)){
                    clone.remove(clone.indexOf(primeFactor));
                }
                else{
                    primes.add(primeFactor); //not added to clone, because I am using the
                    //existing and unchanged arraylist to check against factorTree
                }
            }//end of inner for loop that cycles through factorTree

            clone = (ArrayList<Integer>) primes.clone(); //refresh clone to primes arraylist for the next iteration

        }//end of outer loop for numbers 2 through 20

        int theDivisibleNumber  = 1;
        for(int i = 0; i < primes.size(); i++){
            theDivisibleNumber *= primes.get(i);
        }

        return theDivisibleNumber;
    }//end of method problem5()



    /**
     * method that returns a factor tree of the number n
     * @param n
     * @return an arraylist that is the factor tree
     */
    public static ArrayList<Integer> factorTree(int n){

        ArrayList<Integer> factorTree = new ArrayList<Integer>();
        while(n > 1){

            //divide remainder by the smallest prime number(greater than 1) that divides evenly
            for(int i = 2; i<= n; i++){

                if(isPrime(i) && (n % i) == 0){

                    factorTree.add(i); //put the prime factor into the factor tree
                    n /= i; //update the remainder
                    break;
                }
            }//end of for loop
        }//end of while loop

        return factorTree;
    }


    //method that indicates whether formal parameters are prime
    public static boolean isPrime(int original) {

        boolean isPrime = true;
        for (int i = 2; i < original; i++) {
            if (original % i == 0) {
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