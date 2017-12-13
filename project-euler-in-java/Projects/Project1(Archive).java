package Projects;

public class Project1 {

    //Problem 1 (Solved): find sum of all multiples of 3 or 5 below 1000
    public static int problem1() {
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
