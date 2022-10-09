import java.security.Principal;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthRadioButtonMenuItemUI;
public class Stringlength {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string:-");
        String str = sc.nextLine();
        int len = str.length();
        System.out.println("string contains:-" +len+ "  contact");
 

    }
    
}
