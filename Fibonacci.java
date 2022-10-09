import java.util.*;
class Fibonacci
{
    public static void main(String args[])
    {
        int a=0; b=1; tot=0;
        int i,num;
        Scanner sc= new Scanner (System.in);
        num= sc.nextInt();
        for(i=0;i<=num; i++)
        [
            System.out.println(a+""+b+""+tot);
            tot=a+b;
            a = b;
            b = tot;

        ]

    }
}