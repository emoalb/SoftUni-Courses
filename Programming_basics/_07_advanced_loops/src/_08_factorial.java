import java.util.Scanner;

public class _08_factorial {
    public static void main(String [] args){

        Scanner console = new Scanner(System.in);
        int num=1;
        int n = Integer.parseInt(console.nextLine());
        for (int i = 1; i<=n;i++)  {
            num=num*i;


        }
        System.out.println(num);
    }
}
