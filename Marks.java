import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner n=new Scanner(System.in);
        int num;
        System.out.println("Enter marks:-");
        num=n.nextInt();
        if(num>90)
        {
            System.out.println("Excilent");
            
        }
        else if(num>80 && num<=90)
        {
            System.out.println("good");
        }
        else if(num>70 && num<=80)
        {
            System.out.println("fair");
        }
        else if(num>60 && num<=70)
        {
            System.out.println("meets expectation");
        }
        else if(num<60)
        {
            System.out.println("below");
        }
        else
        {
            System.out.println("invalid results");
        }
    }
}