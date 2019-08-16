import java.util.Scanner;

/**
 * Created by Kunec on 07/08/2017.
 */
public class DrawSquare {
    public static void main(String [] args) {

        Scanner console = new Scanner(System.in);
int n = Integer.parseInt(console.nextLine());
for (int i=0 ; i<n;i++)
{
    System.out.printf("*");
    System.out.println(repeatStr(" *",n-1) );
    

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
