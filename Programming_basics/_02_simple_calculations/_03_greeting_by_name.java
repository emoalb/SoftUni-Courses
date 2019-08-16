import java.util.Scanner;

/**
 * Created by Zorak on 7/11/2017.
 */
public class _03_greeting_by_name {

    public static void main( String[] args)
    {
         Scanner console = new Scanner(System.in);
       String name = console.nextLine();

        System.out.printf("Hello, %s!\n",name);


    }
}