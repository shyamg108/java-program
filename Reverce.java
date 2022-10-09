
import java.util.*;
public class Reverce 
{
    public static void main(String args[])
    {
       int n ;
       Scanner obj=new Scanner(System.in);
       System.out.print("Enter any number:-");
       n=obj.nextInt();
       int temp =n;
       while(temp>0)
       {
        int rev=temp%10;
        temp=temp/10;
        System.out.print(+rev);
       }
    }
}
