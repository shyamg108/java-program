import java.util.Scanner;
class Fibonacci
{
public static void main(String args[]){
int a=0,b=1,tot=0,i,nam;
System.out.print("Entet number :-");
Scanner s= new Scanner(System.in);
nam = s.nextInt();
System.out.print(a+" ");
System.out.print(b+" ");
for( i=0;i<=nam;i++)
{

 tot = a + b;
 a = b;
b = tot;

System.out.print(tot+" ");
}
}
}