package Projects;

public class Project6 {


    //Project 6(Solved): Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
    public static int problem6(){

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
