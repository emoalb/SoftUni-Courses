import java.util.Scanner;


public class _01_square_area {

    public static void main( String[] args)
    {
        Scanner console = new Scanner(System.in);
        System.out.printf("a=");
        int a = Integer.parseInt(console.nextLine());
        int area = a*a;
        System.out.printf("Square = %d\n",area);


    }
}