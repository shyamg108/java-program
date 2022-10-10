import java.util.*;
 class Person
    {
        private int age;
        private String name;
        public  void setAge(int a)
        {
            age=a;
        }
        public  void setName(String b)
        {
          name =b;
        }
        public int  getAge()
        {
          return(age);
        }
        public  String  getName()
        {
          return(name);
        }
    }
    class Student extends Person
     {
        private int rollno;
        private String stream;
        public void setrollno(int r)
        {
            rollno = r;
        }
        public void setstream(String s)
        {
            stream = s;
        }
        public int getrollno()
        {
            return(rollno);
        }
        public String getstream()
        {
            return(stream);
        }
     }
class Inheritence 
{
  public static void main(String args[])
   {
        Student  s1= new Student();
        s1.setName("Shyam");
        s1.setAge(23);
        s1.setrollno(12111600);
        s1.setstream("MCA");
        System.out.println("Student name:-"+s1.getName());
        System.out.println("Student Age:-"+s1.getAge());
        System.out.println("Student name:-"+s1.getrollno());
        System.out.println("Student name:-"+s1.getstream());
    }
}

