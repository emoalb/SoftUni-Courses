import java.util.Scanner;

/**
 * Created by Kunec on 19/07/2017.
 */
public class _14_sum_seconds {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min1 = Integer.parseInt(console.nextLine());
        int min2 = Integer.parseInt(console.nextLine());
        int min3 = Integer.parseInt(console.nextLine());
        int sum = min1+min2+min3;
        int min = sum /60;
        double sec = (sum%60);
if (sec>9) {
    System.out.printf("%d:%.0f", min, sec);
}else {
    System.out.printf("%d:0%.0f", min, sec);
}



    }
}