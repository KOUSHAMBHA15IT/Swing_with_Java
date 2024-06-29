import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui3 {// to learn about JRadio button

    public static void main(String[] args) {
        Radiodemo r= new Radiodemo();
    }

}

class Radiodemo extends  JFrame
{
     JTextField t1;
     JButton b;
     JRadioButton r1,r2;
     JLabel l;
     public Radiodemo(){
         t1= new JTextField(20);
         b = new JButton("OK");
         r1= new JRadioButton("Male");
         r2= new JRadioButton("Female");
         l= new JLabel("Greetings");

         ButtonGroup bg = new ButtonGroup();
         bg.add(r1);
         bg.add(r2);

         add(t1); add(b);  add(r1);  add(r2); add(l);
         b.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 String name = t1.getText();

                 if(r1.isSelected()){
                     name="Mr. "+ name;
                 }
                 else{
                     name="Ms. "+ name;
                 }

                 l.setText(name);
             }
         });

         setLayout(new FlowLayout());
         setVisible(true);
         setSize(400,400);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
}
