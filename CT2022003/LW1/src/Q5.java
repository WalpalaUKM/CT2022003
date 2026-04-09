import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q5 {
    public static void main(String[] args) {
        LocalDate objDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE,MMM dd YYYY");
        String formatDate = objDate.format(formatter);
        System.out.println(formatDate);
    }
}
