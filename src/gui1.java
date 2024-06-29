import javax.swing.*;
import java.awt.*;

public class gui1 {
    public static void main(String[] args) {
        abc obj = new abc();
        obj.setVisible(true);
        obj.setSize(400,400);
    }
}

class abc extends JFrame {// follows card layout only follows the last added frame
    public abc(){

        JLabel l= new JLabel("Hello Java");
        JLabel l1= new JLabel("Welcome to Java");
        add(l);
        add(l1);
        System.out.println("Done with frames");
        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}