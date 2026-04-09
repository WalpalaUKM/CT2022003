import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q7 {
    public static void main(String[] args) {
        LocalDateTime objTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formateTime = objTime.format(formatter);

        JFrame frame = new JFrame();
        frame.setTitle(formateTime);
        frame.setSize(600,400);
        frame.setVisible(true);

    }
}
