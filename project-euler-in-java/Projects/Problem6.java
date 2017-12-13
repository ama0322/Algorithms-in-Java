package ProblemsAndSolutions;


/*
 * Project 6: Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {


    /**
     * Method - them sum of the squares of the first 100 numbers and the square of that same sum are calculated.
     * The difference between the two values is then calculated and returned
     *
     * @return int - the solution
     */
    public static int solution(){

        int sumOfSquares = 0;
        int squareOfSums = 0;

        for(int i = 1; i<=100; i++){
            squareOfSums += i;
            sumOfSquares += i*i;
        }

        squareOfSums = squareOfSums* squareOfSums;

        return squareOfSums - sumOfSquares;
    }


}