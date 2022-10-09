import java.util.*;
class sumcons
{
    public static void main(String args[])
    {
        int n;
        Scanner sc= new Scanner(System.in);
         n=sc.nextInt();
         int count=0;
         for(int i=1;i<=n;i++)
         {
            count+=i;
            System.out.print(i+"+");
         }
        //  int sum = n*(n+1)/2;
         System.out.println("\b:-"+count);
    }
}
