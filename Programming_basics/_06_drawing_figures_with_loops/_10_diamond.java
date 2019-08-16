import java.util.Scanner;

/**
 * Created by Kunec on 08/08/2017.
 */
public class Diamond {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in);
        int count =1;
        int even =0;
        int odd=1;
        int start=1;
        int n =Integer.parseInt(console.nextLine());
        if (n%2==0) {
            count = 2;
            even=1;
            odd=0;

        }
        for (int i=0;i<n/2+odd;i++) {
            if (even==0&&i==0) {
                start=0;
            }else {
                start=1;
            }
            System.out.println(repeatStr("-",n/2-even-i)+repeatStr("*",1)+repeatStr("-",i*2-odd)+repeatStr("*",start)+repeatStr("-",n/2-even-i));
        }
        for (int i=n/2-2+odd;i>=0;i--) {
            if (even==0&&i==0) {
                start=0;
            }else {
                start=1;
            }
            System.out.println(repeatStr("-",n/2-even-i)+repeatStr("*",1)+repeatStr("-",i*2-odd)+repeatStr("*",start)+repeatStr("-",n/2-even-i));
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