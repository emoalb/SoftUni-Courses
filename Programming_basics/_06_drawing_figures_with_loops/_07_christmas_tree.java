import java.util.Scanner;

/**
 * Created by Kunec on 08/08/2017.
 */
public class Tree {
    public static void main (String [] args)
    {

Scanner console = new Scanner(System.in);
int n = Integer.parseInt(console.nextLine());
        System.out.print(repeatStr(" ",n));
System.out.println(" | ");
for (int i=1;i<=n;i++){


    System.out.print(repeatStr(" ",n-i));
        System.out.print(repeatStr("*",i));
    System.out.print(" | ");
    System.out.println(repeatStr("*",i));
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