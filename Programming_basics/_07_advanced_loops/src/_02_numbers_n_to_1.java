import java.util.Scanner;

/**
 * Created by Zorak on 8/14/2017.
 */
public class _02_numbers_n_to_1 {
    public static void main(String [] args){

        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        for (int i = n; i>=1;i--)  {

            System.out.println(i);
        }

    }
}