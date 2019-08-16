import java.util.Scanner;

/**
 * Created by Zorak on 8/14/2017.
 */
public class _03_powers_of_two {
    public static void main(String [] args){

        Scanner console = new Scanner(System.in);
int num=1;
        int n = Integer.parseInt(console.nextLine());
        for (int i = 0; i<=n;i++)  {

            System.out.println(num);
            num=num*2;
        }

    }
}