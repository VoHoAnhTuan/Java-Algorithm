/*
 * Ho Anh Tuan Vo
 * Iterative and recursive factorial
 */

public class Factorial {
    public static void main(String[] args) {
        //Iterative factorial
        System.out.println("Iterative:" + iterative_factorial(3));

        //Recursive factorial
        System.out.println("Recursive:" + recursive_factorial(3));


        
    }

    public static int iterative_factorial(int num) {
        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }


    /*Pattern of factorial
     * 
     * 1! = 1 * 0! = 1
     * 2! = 2 * 1! = 2 * 1
     * 3! = 3 * 2! = 3 * 2 * 1
     * 
     * n! = n * (n - 1)!
     */
    public static int recursive_factorial(int num) {
        if (num == 0) {
            return 1;
        }        

        return num * recursive_factorial(num - 1);
    }
}
