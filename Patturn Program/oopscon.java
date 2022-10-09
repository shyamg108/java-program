import java.util.*;
public class oopscon {
    public static void main(String args[])
    {
     Student s1=new Student();
    //  object creating
      s1.name="shyam";
      s1.age=23;
      s1.hobbies("play football"); 
    //   call mathod /function

      s1.wish("A successful person");
    //   call by variable and passing arguments/parametrerise value
      System.out.println("Enter 1st Student name:-"+s1.name);
      System.out.println("Enter 1st Student Age:-"+s1.age);
      Student s2=new Student();
      //  object creating
      s2.name="Mohan";
      s2.age=25;
      s2.hobbies("play chess");
      //   call mathod /function
      s2.wish( "became a software");
      System.out.println("Enter 2nd Student name:-"+s2.name);
      System.out.println("Enter  2nd Student Age:-"+s2.age);
      s1.post();
      s1.post("SDO");
      Student s3=new Student();
        //  student() these are default constructor because we are kno/ue
      s3.st3();
    }
    
}
class Student
{
    String name;
    int age;
    void hobbies(String x)
    {
        System.out.println("Hobbies is :-"+x); 
    }
    void wish(String y)
    {
        System.out.println("i wil be want in future became a:-"+y);
    }
    void post()
    {
        String p;
        Scanner obj=new Scanner(System.in);
        System.out.print("your post in:-");
        p=obj.nextLine();
    }
    void post(String p)
    {
        System.out.println("your post in:-"+p);
    }
    void st3() 
    // creating function return type void ,(nothing) 
    // then i print something  direct by call
    {
        String name,post,hb;
        int ag;
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter 3rd Student name:-");
        name=obj.nextLine();
        System.out.print("Enter 3rd Student Post:-");
        post=obj.nextLine();
        System.out.print("Enter 3rd Student Hobbies:-");
        hb=obj.nextLine();
        System.out.print("Enter 3rd Student Age:-");
        ag=obj.nextInt();


    }
}

