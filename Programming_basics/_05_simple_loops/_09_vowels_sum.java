import java.util.Scanner;

/**
 * Created by Zorak on 8/2/2017.
 */
public class Vowels {
    public static void main(String [] args) {


        Scanner console = new Scanner(System.in);
String s = console.nextLine();
int sum=0;
for (int i=0 ; i<= s.length()-1;i++){
switch (s.charAt(i)){
    case 'a':
        sum=sum+1;
        break;
    case 'e':
        sum=sum+2;

        break;
    case 'i':
        sum=sum+3;
        break;
    case 'o':
        sum = sum+4;
        break;
    case 'u':
        sum = sum+5;
        break;
}
}
System.out.println(sum);

    }
}