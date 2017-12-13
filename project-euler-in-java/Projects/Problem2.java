package ProblemsAndSolutions;


/*
 * Problem 2 By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
 */
public class Problem2 {

    /**
     * Method - I calculate the fibonacci numbers under 4 million. If they are even, I add them to the sum.
     *
     * @return int - the solution
     */
    public static int solution() {
        int term = 2;
        int termMinusOne = 1;
        int sum = 0;

        //for calculating the next fibonacci number
        int termMinusOneTemp = 1;

        while (term <= 4000000) {
            if (term % 2 == 0) {
                sum = sum + term;
            }

            //update termMinusOne
            termMinusOne = term;

            //advance to next fibonacci number
            term = term + termMinusOneTemp;

            //update termMinusOneTemp
            termMinusOneTemp = termMinusOne;
        }
        return sum;
    }

}