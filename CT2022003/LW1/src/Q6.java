import javax.swing.*;
import javax.swing.text.Highlighter;
import java.awt.image.ImageObserver;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner objscann = new Scanner(System.in);
        Scanner objName = new Scanner(System.in);

        //Get farme title
        System.out.print("Enter Frame Title: ");
        String fname = objName.nextLine();

        //Get Width
        System.out.print("Enter width: ");
        int W = objscann.nextInt();
        //Get Height
        System.out.print("Enter height: ");
        int H = objscann.nextInt();

        //create frame
        JFrame frame = new JFrame();
        frame.setTitle(fname);
        frame.setSize(W, H);
        frame.setVisible(true);
    }
}
