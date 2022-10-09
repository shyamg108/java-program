 import java.util.Scanner;
public class Condition{

public static void main(String args[])
{
    int marks ;
    System.out.println("Entet get marks in exam:-");
    Scanner r = new Scanner(System.in);
    marks = r.nextInt();
    if(marks<25)
    {
        System.out.print("The student is fail");
    }
    else if(marks >=25 && marks <=50)
    {
        System.out.print("The student is 3rd div");
    }
    else if(marks >=50 && marks <= 70)
    {
        System.out.print("The student is 2nd div");
    }
    else
    {
        System.out.print("The student is 1st div");
    }

}
}