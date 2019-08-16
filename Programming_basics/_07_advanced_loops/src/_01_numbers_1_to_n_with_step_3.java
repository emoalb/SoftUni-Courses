import java.util.Scanner;

/**
 * Created by Zorak on 8/14/2017.
 */
public  class _01_numbers_1_to_n_with_step_3 {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        System.out.print("n = ");
        int n = Integer.parseInt(console.nextLine());
        System.out.println("The numbers are: ");
        for (int i = 1; i <= n; i = i + 3) {
 System.out.println(i);

        }
    }
}