import javax.swing.*;
public class SImpleGuil {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);

        frame.setSize(100,100);
        frame.setVisible(true);
    }

}
