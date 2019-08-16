import java.util.Scanner;

/**
 * Created by Kunec on 08/08/2017.
 */
public class sunglass {
    public static void main(String [] args) {
        Scanner console = new Scanner(System.in) ;
        int n = Integer.parseInt(console.nextLine());
        String str = " ";
System.out.println(repeatStr("*",2*n)+ repeatStr(" ",n)+repeatStr("*",2*n));
for (int i=1;i<=n-2;i++){
if(i==(n-1)/2 ) {str="|";}
else{ str = " ";}

    System.out.println("*"+repeatStr("/",2*n-2)+"*"+repeatStr(str,n)+"*"+repeatStr("/",2*n-2)+"*");
}
        System.out.println(repeatStr("*",2*n)+ repeatStr(" ",n)+repeatStr("*",2*n));
    }

    public static String repeatStr(String str ,int count){

        StringBuilder sb = new StringBuilder();


        for (int i=0;i<count;i++){
            sb.append(str);
        }
        return sb.toString() ;

    }
}