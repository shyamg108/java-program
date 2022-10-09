import java.util.*;
class rangeprime
    {
        public static void main(String args[])
        {
            int low;
            int high;
            Scanner sc= new Scanner(System.in);
            low=sc.nextInt();
            high= sc.nextInt();
            System.out.println("The prime number"+low+ "to" +high+":-");
            for(int n=low;n<high;n++)
            {
                 int count=0;
                 for(int div=2;div<=n;div++)
                 {
                     if(n%div==0)
                     {
                         count++;
                        
                     }
                 }
                 if(count==0)
                 {
                     System.out.println(n);
                 }
                 
            }
             
             
             
        }
    
   
