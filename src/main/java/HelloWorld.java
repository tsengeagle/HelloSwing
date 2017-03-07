import javax.management.remote.JMXConnectorFactory;
import javax.swing.*;
import java.awt.*;
import java.beans.DesignMode;

/**
 * Created by tsengeagle on 2017/03/07.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.print("hello!!");

        JFrame frame = new JFrame();
        frame.setTitle("Hello frame");
        frame.setSize(600, 600);

        MyForm form = new MyForm();
        frame.setContentPane(form.panel1);
        frame.setVisible(true);


    }
}
