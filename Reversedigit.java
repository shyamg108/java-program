// Write a program reverse digit as like 12345=54321

import java.util.*;
public class Reversedigit 
{
    public static void main(String args[])
    {
        int n;
        int dig;
      System.out.print("Enter any number:-");
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
      while(n>0)
      {
      dig = n % 10;
      n =  n / 10;
      System.out.print(dig);
      }
    }
}
