import java.util.Scanner;

/**
 * Created by Zorak on 7/25/2017.
 */
public class _01_personal_titles {
    public static void main(String[] args) {
Scanner console = new Scanner(System.in);
double age = Double.parseDouble(console.nextLine());
String gender = console.nextLine();

if (age<16) {
    if(gender.equals("m")) {
        System.out.println("Master");

    }else if (gender.equals("f")) {
        System.out.println("Miss");
    }

} else {
    if (gender.equals("m")) {
        System.out.println("Mr.");
    }else if (gender.equals("f")) {
        System.out.println("Ms.");
    }
}

    }
}