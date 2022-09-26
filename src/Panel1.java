import javax.swing.*;
import  java.awt.*;

public class Panel1 {
    public static void main(String[] args) {
        Panel1 gui1 = new Panel1();
        gui1.go_new();
    }
    public void go_new(){
        JFrame frame = new JFrame();
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.darkGray);

        JButton button = new JButton("shock me");
        JButton button1 = new JButton("bliss");
        JButton button2 = new JButton("huh");

        panel2.add(button);
        panel2.add(button1);
        panel2.add(button2);
        frame.getContentPane().add(BorderLayout.EAST,panel2);
        frame.setSize(150,200);
        frame.setVisible(true);


    }
}
