import java.util.Scanner;

/**
 * Created by Zorak on 7/26/2017.
 */
public class Weel {
    public static void main (String [] args)
    {
        Scanner con = new Scanner(System.in);

       String animal = con.nextLine();
       if (animal.toLowerCase().equals("crocodile")||animal.toLowerCase().equals("tortoise")||animal.toLowerCase().equals("snake")) {
        System.out.println("reptile");
    } else  if (animal.toLowerCase().equals("dog")) {
           System.out.println("mammal");
       }else {
           System.out.println("unknown");
       }


    }
}