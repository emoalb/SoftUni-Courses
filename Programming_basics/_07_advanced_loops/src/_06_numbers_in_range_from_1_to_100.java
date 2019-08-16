import java.util.Scanner;

public class _06_numbers_in_range_from_1_to_100 {
    public static void main (String [] args) {

        Scanner console = new Scanner(System.in);

        int n=0;
        do {

            System.out.print("Еnter a number in the range [1...100]: ");
            n=Integer.parseInt(console.nextLine());
            if(n<1||n>100) System.out.println("Invalid number!");
        }while (n<1||n>100);
        System.out.println("The number is: "+n);


    }
}
