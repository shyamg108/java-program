import javax.swing.*;

public class practice21 {

public static void main(String[] args) {
JFrame f = new JFrame();
JButton b1 = new JButton("CAP615");
b1.setBounds(30, 30, 100, 40);
f.add(b1);
JButton b2 = new JButton("CAP680");
b2.setBounds(30, 80, 100, 40);
f.add(b2);
f.setSize(600, 400);
f.setLayout(null);
f.setVisible(true);
}

}