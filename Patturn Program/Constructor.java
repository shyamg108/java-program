import java.util.*;
public class Constructor
{
  private int l,b,h;
  public Constructor()
  {
    l=10; b=20; h= 12;
    System.out.println("length is :-"+l);
  }  
  public Constructor(int L,int B, int H) /*we can constructor overloading */
  {
    l=L; b=B; h=H;
    System.out.println("length is:-"+l+"\nwidth is:-"+b+"\nHeight is :-"+h);
  }
  public static void main(String args[])
  {
    Constructor b1= new Constructor();/*constructor is automatic call after that initialize object */
    Constructor b2 = new Constructor(15,20,13);
  }
}
