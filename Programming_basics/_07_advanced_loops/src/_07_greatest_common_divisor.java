import java.util.Scanner;

public class _07_greatest_common_divisor {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        int a=Integer.parseInt(console.nextLine());
        int b= Integer.parseInt(console.nextLine());

        while (b > 0)
        {
            int temp = b;
            b = a % b;
            a = temp;
        }
        System.out.println(a);

    }
}
