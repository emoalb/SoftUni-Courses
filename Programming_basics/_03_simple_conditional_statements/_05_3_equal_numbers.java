import java.util.Scanner;

/**
 * Created by Kunec on 19/07/2017.
 */
public class _05_3_equal_numbers {
    public static void main (String [] args) {
        Scanner console = new Scanner(System.in);
int a =Integer.parseInt(console.nextLine());
        int b =Integer.parseInt(console.nextLine());
        int c =Integer.parseInt(console.nextLine());
    if (a==b&&b==c) {
        System.out.println("yes");

    }else

    {
        System.out.println("no");
    }

    }
}