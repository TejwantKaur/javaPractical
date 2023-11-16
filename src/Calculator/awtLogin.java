package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class awtLogin {
    public static void main(String[] args) {

        Frame f = new Frame();
        f.setLayout(new FlowLayout());
        f.setVisible(true);
        f.setSize(300,400);
        f.setTitle("Login Page..");


        Label a1 = new Label("User Name");
        Label a2 = new Label("Password");

        TextField t1 = new TextField(15);
        TextField t2 = new TextField(15);
        t2.setEchoChar('*');

        Button b = new Button("Login");

        f.add(a1); f.add(t1);
        f.add(a2); f.add(t2);
        f.add(b);

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent) {
                System.exit(0);
            }
        });
    }

}
