import java.util.Scanner;

/**
 * Created by Zorak on 7/11/2017.
 */
public class _04_concatenate_data {
    public static void main( String[] args)
    {
        Scanner console = new Scanner(System.in);
        String firstName = console.nextLine();
        String lastName = console.nextLine();
        int age = Integer.parseInt(console.nextLine());
        String town = console.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s. ",firstName,lastName,age,town);


    }
}