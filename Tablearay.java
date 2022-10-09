import java.util.Scanner;

Class Tablearay
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,i=1;
int a[] = new int[10];
System.out.println("Enter any number:");
n=sc.nextInt();
while(i<=10) // to create table and stored into array
{
a[i-1]=(n*i);
i++;
}
for(i=0; i<10; i++)
{
System.out.println(a[i]);
}
}
}