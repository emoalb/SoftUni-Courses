import java.util.Scanner;

public class _12_fibonacci {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());


        System.out.println( fibonacciLoop(num));
    }





    public static int fibonacciLoop(int number) {
        if (number == 1 || number == 0) {
            return 1;
        }
        int fibo1 = 1, fibo2 = 1, fibonacci = 1;
        for (int i = 2; i <=number; i++) {
            fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; // Fibonacci number
    }
}
