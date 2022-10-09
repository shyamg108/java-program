import javax.swing.*;
public class Main{
public static void main(String[] args) {
JFrame frame = new JFrame("Button");
JButton button = new JButton("ADD");
button.setBounds(60,50,100,40);
frame.add(button);
JButton button2 = new JButton("SUM");
button2.setBounds(200,50,100,40);
frame.add(button2);
JButton button3 = new JButton("MUL");
button3.setBounds(60,100,100,40);
frame.add(button3);
JButton button4 = new JButton("DIV");
button4.setBounds(200,100,100,40);
frame.add(button4);
JButton button5 = new JButton("caculator");
button5.setBounds(60,150,100,40);
frame.add(button5);
button5.setSize(250,50);
frame.setSize(500,200);
frame.setLayout(null);
frame.setVisible(true);
}
}class pri {
    
}
