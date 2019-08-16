import java.util.Scanner;

public class _13_number_pyramid {
    public static void main (String [] args)
    {
        Scanner console = new Scanner(System.in);
        int num = Integer.parseInt(console.nextLine());
        int nu=0;
        for (int i = 1 ; i<=num;i++) {
            for (int b=1;b<=i;b++)
            {
                nu++;

                System.out.print(nu+" ");
                if(nu>=num)break;

            }
            if (nu>=num)break;
            System.out.printf("\n");
        }
    }
}
