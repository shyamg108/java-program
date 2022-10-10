

/*Instance initialization block program */

import java.util.*;
public class InstanceBlock
{
public  int x; /*instance block  */
{
    System.out.println("initialization block x:= "+x);
    x=5;
}
public InstanceBlock() /*constructor we know that fuction name class name so it is consturctor */
{
    System.out.println("Constructor :x="+x);

}
public static void main(String args[])
{
    InstanceBlock t1 = new InstanceBlock();
    InstanceBlock t2 = new InstanceBlock();
}
}
