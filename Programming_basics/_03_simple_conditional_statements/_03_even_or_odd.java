import java.util.Scanner;


public class _03_even_or_odd {
    public static void main (String [] args) {
        Scanner console = new Scanner (System.in);

        int number = Integer.parseInt(console.nextLine());
        boolean even = (number%2==0);
        if (even==true) {
            System.out.println("even");
        } else
        {
            System.out.println("odd");
        }




    }
}