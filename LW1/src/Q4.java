//Date formatting
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Q4 {
    public static void main(String[] args) {
        LocalDate objDay = LocalDate.now();
        DateTimeFormatter formtter = DateTimeFormatter.ofPattern("dd MMM YYYY");
        String formatDate = objDay.format(formtter);
//before formatting date
        System.out.println(objDay);
//After formatting date
        System.out.println(formatDate);
    }
}
