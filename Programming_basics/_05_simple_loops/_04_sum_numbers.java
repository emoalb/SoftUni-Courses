import java.util.Scanner;

/**
 * Created by Zorak on 7/31/2017.
 */
public class NumSum {
    public static void main (String[] args){
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        int sum=0;
        int num[] = new int [n+1];

            for (int i = 1; i <= n; i++) {
                num[i] = Integer.parseInt(console.nextLine());
                sum = sum + num[i];

            }
            System.out.println(sum);

    }
}