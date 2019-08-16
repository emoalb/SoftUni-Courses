import java.util.Scanner;

/**
 * Created by Kunec on 07/08/2017.
 */
public class Frame {
    public static void main(String [] args) {

        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        if(n!=0) {
            System.out.print("+ ");
            System.out.print(repeatStr("- ", n - 2));
            System.out.println("+");
        }


        for (int i=0;i<n-2;i++) {
            System.out.print("| ");
            System.out.print(repeatStr("- ",n-2) );
            System.out.println("|");
        }
        if(n!=0) {

                System.out.print("+ ");
                System.out.print(repeatStr("- ", n - 2));
                System.out.println("+");


        }
    }

    public static String repeatStr(String str ,int count){

        StringBuilder sb = new StringBuilder();


        for (int i=0;i<count;i++){
            sb.append(str);
        }
        return sb.toString() ;

    }
}
