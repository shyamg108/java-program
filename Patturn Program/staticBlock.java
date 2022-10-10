/*  static initialization block  */
import java.util.*;
public class staticBlock 
{
public static int k;
static     /* static initialization block only one time print however many more create object then still  */
{
System.out.println("Static initialization block:x"+k);
k=10;
}
public staticBlock()
{
    System.out.println("Constructor:k="+k);
}
public static void main(String args[])
{
staticBlock s1= new staticBlock();
staticBlock s2=new staticBlock();
}

}    

