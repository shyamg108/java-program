import java.util.*;
public class printdigitnum 
{
    public static void main(String args[])
    {
        int n;
        int nod=0;
        int temp;
        temp=n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        while(temp!=0)
        {
            temp=temp/10;
            nod++;
        }
        int div = (int)Math.pow(10,nod-1);
        while(div!=0)
        {
            int q=n/div;
            System.out.println(q);
            div=n % div;
            div = div/10;
        }



    }
}

