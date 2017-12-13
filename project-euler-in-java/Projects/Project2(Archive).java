package Projects;

public class Project2 {

    //Problem 2 (Solved) By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
    public static int problem2() {
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
