import java.util.*;
public class function5 {
    
    public static void oddeven(int x)
    {
        // int x;
        // Scanner sc =new Scanner(System.in);
        // fuction5 obj=new fuction5();
        //  System.out.println("Enter any number:-");
        // x= obj.oddeven();
        if(x%2==0)
        {
            System.out.println(x+"is even number");
        }
        else
        {
          System.out.println(x+"is odd number");
        }
    
    }
    public static void prime(int x)
    {
     int count=1;
     for(int i=2;i<=x;i++)
     {
        if(x%i==0)
        {
            count++;
        }
     }
     if(count==2)
     {
        System.out.println(x+"This is prime number");
     }
     else
     {
        System.out.println(x+"This is  not prime number");
     }
    }
    public static void main(String args[])
    { 
        
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter any number check:-");
         int y =obj.nextInt();
         System.out.print("Enter any number for check prime number:-");
         int z=obj.nextInt();
         oddeven(y);
         prime(z);
        
    }
    
}
