import java.util.Scanner;

/**
 * Created by Kunec on 19/07/2017.
 */
public class _10_number_100_to_200 {
    public static void main (String [] args) {
        Scanner console = new Scanner (System.in);

      int num=Integer.parseInt(console.nextLine());
        if (num<100)
        {
            System.out.println("Less than 100");
        }else if (num>=100&&num<=200)
        {
            System.out.println("Between 100 and 200");
        }else if (num>200){
            System.out.println("Greater than 200");
        }


    }
}