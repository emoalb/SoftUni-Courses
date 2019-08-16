import java.util.Scanner;

/**
 * Created by Kunec on 08/08/2017.
 */
public class House {
    public static void main (String [] args) {
        Scanner console = new Scanner(System.in);
        int count =1;
int even =0;
int odd=1;
        int n =Integer.parseInt(console.nextLine());
        if (n%2==0) {
            count = 2;
            even=1;
            odd=0;
        }
            for (int i=0;i<n/2+odd;i++) {
                System.out.println(repeatStr("-",n/2-even-i)+repeatStr("*",count+2*i)+repeatStr("-",n/2-even-i));
            }
            for (int i=0;i<n/2;i++){
                System.out.println(repeatStr("|",1)+repeatStr("*",n-2)+repeatStr("|",1));
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