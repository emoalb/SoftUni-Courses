import java.util.Scanner;

public class _11_enter_even_number {
    public static void main(String [] args )
    {
        Scanner console = new Scanner(System.in);
        int num=0;
        boolean error = true;
        do  {
            try {
                do {

                    System.out.print("Enter even number:");
                    num = Integer.parseInt(console.nextLine());
                    error = false;
                    if (num%2!=0){
                        System.out.println("The number is not even");
                    }
                }while(num%2!=0);

            } catch (Exception e) {
                System.out.println("Invalid number!");
            }
        }while(error==true );

        System.out.println("Even number entered: "+num);




    }

}
