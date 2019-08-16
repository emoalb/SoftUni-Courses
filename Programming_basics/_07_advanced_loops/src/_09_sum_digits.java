import java.util.Scanner;

public class _09_sum_digits {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        int num =Integer.parseInt(console.nextLine());
        int c=0;
        while((num)>0) {


            c = c+num%10;
            num = num/10;
        }

        System.out.println(c);
    }
}
