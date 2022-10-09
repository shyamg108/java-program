// The program create GUI objects using the 
// classes JButton,JLabel,JTextField,JCheckBox,JRadioButton

import javax.swing.*;
public class GUIComponents
 {
    public static void main(String args[])
    {
        // create button with text
        JButton jbt=new JButton("Ok");
        // create Label with text
        JLabel jbl =  new JLabel("Enter your name:-");
        JTextField jtf=new JTextField("Typw name here:-");
        JCheckBox jchkBold= new JCheckBox("Bold");
        JRadioButton jrbred=new JRadioButton("Red");
        JComboBox jcbocolor=new JComboBox(new String[]{"Red","Green","Blue"});
        JPanel panel= new JPanel();
        panel.add(jbt);
        panel.add(jbl);
        panel.add(jtf);
        panel.add(jchkBold);
        panel.add(jrbred);
        panel.add(jcbocolor);
        JFrame frame=new JFrame();
        frame.add(panel);
        frame.setTitle("Show GUI Components");
        frame.setSize(450,100);
        frame.setLocation(200,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);


    }
}
