import java.util.*; /*Fuction overloading  we know that when fuction name */
class a   /*name need to same and arguments are different  */
{ 
public void f1(int x) /*function name same  */
{
    System.out.println("class A");
}
}
class b extends a
{
    public void f1(int x,int y) /*function name same  argument different  */
    {
        System.out.println("class b");
    }
}
public class fun_overloading 
{
    public static void main(String args[])
    {
    b obj = new b();
    obj.f1(5);
    obj.f1(4,6);
    }
}
