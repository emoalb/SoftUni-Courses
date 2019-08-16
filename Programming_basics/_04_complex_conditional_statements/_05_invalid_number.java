import java.util.Scanner;

/**
 * Created by Zorak on 7/26/2017.
 */
public class InvalidNum {
    public static void main ( String[] args )
    {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());

        if (((number <100)&&number!=0) || (number>200) ) {
 
            System.out.println("invalid");
        }
    }
}