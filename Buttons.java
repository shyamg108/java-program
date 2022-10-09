import javax.swing.*;
public class Buttons {
public static void main(String[] args) {
JFrame f=new JFrame();
JButton b1=new JButton("ADD");
JButton b2=new JButton("SUB");
JButton b3=new JButton("MUL");
JButton b4=new JButton("DIV");
JButton b5=new JButton("CALCULATOR");
b1.setBounds(50,30,100,40);
f.add(b1);
b2.setBounds(200,30,100,40);
f.add(b2);
b3.setBounds(50,100,100,40);
f.add(b3);
b4.setBounds(200,100,100,40);
f.add(b4);
b5.setBounds(90,150,150,40);
f.add(b5);
f.setSize(500,350);
f.setLayout(null);
f.setVisible(true);
}
}