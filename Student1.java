import java.util.*;
public class Student1
{
    static String name;
    static int reg;
    
    public static void about()
    {
        String stream="MCA";
        System.out.println("Student course Name:-"+stream);
        String ins="Lovly  Professional University ";
        System.out.println("Student university Name:-"+ins);
        
    }


 public class Car
 {
    public static void detail()
    {
        String com="Suzuki";
        String model="suzuki 0008";
        int price = 50000000;
        System.out.println(" Vehicle company name is:-"+com);
        System.out.println(" Vehicle model name is:-"+model);
        System.out.println(" Vehicle  price  is:-"+price);
    }

 

    public static void main(String args[])
    {
       Student1 info=new Student1();
       Car vehicle=new Car();
         info.name="shyam";
         info.reg=12111;
         System.out.println("Student Name:-"+name);
         System.out.println("Student Reg no:- "+reg);
        info.about();
        vehicle.detail();
    }
 }
}

 


    

