import java.util.Scanner;
public class _06_square_of_stars {



public static void main(String[] args) {

Scanner console = new Scanner(System.in);

int n = Integer.parseInt(console.nextLine());

for(int i=0;i<n;i++)
{
System.out.print("*");

}
System.out.print("\n");
for ( int kk=0; kk<(n-2); kk++)
{
System.out.print(Repeat(n));
System.out.print("\n");
}
for(int i=0;i<n;i++)
{
System.out.print("*");

}
}


static String Repeat (int number)
{
String nuke="*";

for (int k=0 ; k<(number-2);k++)
{
nuke+=" ";
}
nuke+="*";
return nuke;
}
