import java.util.*;/* function overriding when fuc name and  */
class  A /*Argruments are the same is called fun overriding  */
{
    public void f1(int x)/*function name and argument same another */
    {
        System.out.println("Class A");
    }

}
class B extends A
{
    public void f1(int x)/*function name and arguement same  */
    {
        System.out.println("Class b");
    }
}
public class fun_overriding 
{
 public static void main(String args[])
 {
    B obj= new B();
    obj.f1(5);
    
 }   
}
