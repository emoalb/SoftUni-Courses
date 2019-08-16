import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class _13_1000_days_after_birth {
    public static void main (String[] args)
    {

        Scanner console = new Scanner(System.in);
        String newdate;
        LocalDate ld,nd ;
        String date = console.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        ld = LocalDate.parse(date,formatter);
        nd = ld.plusDays(999);
        newdate = nd.format(formatter);
        System.out.printf("%s",newdate);


    }
}