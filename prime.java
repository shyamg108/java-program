import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num;
        // System.out.println("Enter any number:-");
        num= sc.nextInt();
        for(int i=0;i<=num;i++)
        {
            int n =sc.nextInt();
            int count=0;
            for(int div=1;div<=n;div++)
            {
                if(n%div==0)
                {
                count++;
                }
                
            }
            
         if(count==2)
            {
                 System.out.println("This is prime number:-");
            }
         else
            {
             System.out.println("This is not  prime number:-");
            }
          
        }


    }
}
