import java.util.Scanner;

public class _14_number_table {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int n=0;
        for (int col = 0; col < num; col++) {
            for (int row = 0; row < num; row++) {

                n = row + col + 1;
                if (n>num) { n = 2*num-n;}


                System.out.print(n+ " ");

            }


            System.out.printf("\n");
        }


    }
}
