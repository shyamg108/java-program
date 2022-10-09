import java .util.*;
public class Check
 {
    public static void main(String args[])
    {
        Program obj= new Program();
        obj.prime();
    }
}
 public Class Program
{
    
public static void prime()
    {   
    int n;
  int  count=1;
   Scanner num=new Scanner(System.in);
   System.out.println("Enter any number:-");
   n=num.nextInt();
   for(int i=1;i<=n;i++)
   {
    if(n%i==0)
    {
        count++;
    }
   }
   if(count==2)
   {
    System.out.println(n+"this number is prime number");
   }
   else
   {
    System.out.println(n+"This number is not prime number");
   }
}
}
