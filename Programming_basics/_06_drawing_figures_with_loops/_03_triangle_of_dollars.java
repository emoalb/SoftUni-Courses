import java.util.Scanner;

/**
 * Created by Kunec on 07/08/2017.
 */
public class DrawTriang {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n =Integer.parseInt(console.nextLine());
        for (int i=0;i<n;i++) {
System.out.print("$");
            System.out.println(repeatStr(" $",i));

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