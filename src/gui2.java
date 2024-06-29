import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui2 {// adding two numbers
    public static void main(String[] args) {
        Addition obj = new Addition();

    }
}
class Addition extends JFrame implements ActionListener {
    JTextField t1,t2;
    JLabel l;
    JButton b;
    public Addition(){

         t1= new JTextField(30);
         t2= new JTextField(30);

         b = new JButton("OK");
         l = new JLabel("Result");

        add(t1);
        add(t2);
        add(b);
        add(l);

        b.addActionListener(this);//interface



        setLayout(new FlowLayout());
        setVisible(true);
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int n1= Integer.parseInt(t1.getText());
        int n2= Integer.parseInt(t2.getText());

        int v= n1+n2;

        l.setText(String.valueOf(v));
    }
}



