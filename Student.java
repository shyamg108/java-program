import java.util.Scanner;
public class Student
{
 private String name;
 private int reg;
 private int age;
 private int mark1;
 private int mark2;
 private int mark3;
 private int maximum;
 private double average;

 public Student(String nam,int r, int old, int sub1, 
 int sub2, int sub3) {
 name = nam;
 reg = r;
 age = old;
 mark1 = sub1;
 mark2 = sub2;
 mark3 = sub3;
 }

 public Student() {
 name = "";
 age = 0;
 mark1 = 0;
 mark2 = 0;
 mark3 = 0;
 maximum = 0;
 average = 0;
 }

 public void accept() {
 Scanner obj = new Scanner(System.in);
 System.out.print("Enter name:- ");
 name = obj.nextLine();
 System.out.print("Enter reg:- ");
 reg = obj.nextInt();
 System.out.print("Enter age:- ");
 age = obj.nextInt();
 System.out.print("Enter 1st Subject Marks:- ");
 mark1 = obj.nextInt();
 System.out.print("Enter 2nd Subject  Marks:- ");
 mark2 = obj.nextInt();
 System.out.print("Enter 3rd  Subject Marks:- ");
 mark3 = obj.nextInt();

 System.out.println("********************************************************");

 }
 public void compute() {
 if (mark1 > mark2 && mark1 > mark3)
 maximum = mark1;
 else if (mark2 > mark1 && mark2 > mark3)
 maximum = mark2;
 else
 maximum = mark3;

 average = (mark1 + mark2 + mark3) / 3.0;
 }

 public void display() {
 System.out.println(" Student Name:- " + name);
 System.out.println("Student Registration Number:- " + reg);
 System.out.println("Student Age:- " + age);
 System.out.println("Marks of 1st subject:- " + mark1);
 System.out.println("Marks of 2nd subject:- " + mark2);
 System.out.println("Marks of 3rd subject:- " + mark3);
 System.out.println("Maximum Marks: " + maximum);
 System.out.println("Average Marks: " + average);
 }

 public static void main(String args[]) {
 Student obj = new Student();
 obj.accept();
 obj.compute();
 obj.display();
 }
}