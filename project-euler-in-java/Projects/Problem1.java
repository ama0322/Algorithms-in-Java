package ProblemsAndSolutions;



/*
 * Problem 1: find sum of all multiples of 3 or 5 below 1000
 */
public class Problem1 {


    /**
     * Method - add numbers divisible by 3 or 5 with no remainder to the sum. Do this to all numbers up to 1000.
     *
     * @return int - the solution
     */

    public static int solution() {
        int sum = 0;
        for (int i = 0; i < 1000; i++) {

            //if i is divisible by 3 or 5, add it to the sum
            if (i % 5 == 0 || i % 3 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

}