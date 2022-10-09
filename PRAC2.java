
import javax.swing.*;
public class PRAC2 {

public static void main(String[] args) {
JFrame f = new JFrame();
JButton b1 = new JButton("Add");
b1.setBounds(50, 30, 100, 40);
f.add(b1);

JButton b2 = new JButton("Subtract");
b2.setBounds(200, 30, 100, 40);
f.add(b2);

JButton b3 = new JButton("Multiply");
b3.setBounds(50, 100, 100, 40);
f.add(b3);

JButton b4 = new JButton("Divide");
b4.setBounds(200, 100, 100, 40);
f.add(b4);

JButton b5 = new JButton("Calculator");
b5.setBounds(90, 150, 150, 40);
f.add(b5);

f.setSize(500, 350);
f.setLayout(null);
f.setVisible(true);
}
}