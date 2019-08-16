import java.util.Scanner;

public class _10_check_prime {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        int a = Integer.parseInt(console.nextLine());
        int num =Math.abs(a);
        boolean isPrime=true;
        int temp;
        if  (a<0){
            System.out.println("Not Prime");
        }else      if (num==0){

            System.out.println("Not Prime");

        } else
        if (num==1)
        {

            System.out.println("Not Prime");

        }  else {

            for (int i = 2; i < num ; i++) {
                temp = num % i;
                if (temp == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime==false) {
                System.out.println("Not Prime");

            }else  System.out.println("Prime");
        }

    }
}
