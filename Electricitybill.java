import java.util.*;
class Electricitybill 
{ 
 public static void main(String args[]) 
 { 
	 long units;
	 double id;
	 double ph;
	int custumer;
	String name;
	double pay=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.print("Name of customer:- ");
	 name= sc.nextLine();
	System.out.print("customer Id:- ");
	 id= sc.nextDouble();
	 System.out.print("Contact of customer:- ");
	 ph= sc.nextDouble();
	
	 
	 System.out.print(" Press 1 for domestric and Press 2 for commertial :- ");
	custumer=sc.nextInt();
	 System.out.print("Enter number of units:- ");
	 units=sc.nextLong();
	if(custumer==1)
	{	 
 	 int fixedpay=250;
	 if(units<=100)
	 pay =fixedpay;

	 else
	 pay=(units-100)*8;
	 System.out.println("Total bill to paid = " +pay); 
	 }
	else if(custumer==2)
	{	
	int frate=1000;
	 if(units<=300)
	 pay = frate;

	 else if(units>300)
	pay=(units-300)*15;
	 System.out.println("Total bill to paid = " +pay); 
	}
	else 
	System.out.println("Invalid input");
}
}