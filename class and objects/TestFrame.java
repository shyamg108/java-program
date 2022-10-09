// The program create two window using the JFrame class.
import javax.swing.JFrame;
public class TestFrame 
{
    public static void main(String args[])
    {
        JFrame fram1= new JFrame();
        fram1.setTitle("Window1");
        fram1.setSize(200,150);
        fram1.setLocation(200,100);
        fram1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram1.setVisible(true);

        JFrame fram2= new JFrame();
        fram2.setTitle("Window2");
        fram2.setSize(200,150);
        fram2.setLocation(410,100);
        fram2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fram2.setVisible(true);
        
    }
}
