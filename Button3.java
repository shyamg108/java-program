import javax.swing.*;
class Button3
{
public static void main(String[] args){
JFrame j=new JFrame();
JButton b1=new JButton("Add");
b1.setBounds(130,100,100,40);
j.add(b1);
JButton b2=new JButton("Sub");
b2.setBounds(330,100,100,40);
j.add(b2);
JButton b3=new JButton("Mul");
b3.setBounds(130,300,100,40);
j.add(b3);
JButton b4=new JButton("Div");
b4.setBounds(330,300,100,40);
j.add(b4);
JButton b5=new JButton("Calculator");
b5.setBounds(130,500,500,50);
j.add(b5);
j.setSize(800,800);
j.setLayout(null);
j.setVisible(true);
}
}