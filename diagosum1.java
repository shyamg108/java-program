import java.util.Scanner;
class diagosum1
{
public static void main(String args[])
{Scanner obj=new Scanner(System.in);
int [][]ar=new int[3][3];
int sum=0;
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
ar[i][j]=obj.nextInt();
}
}

for(int i=0;i<3;i++)
{
sum=sum+ar[i][i];
}
System.out.print("First digonal:"+sum+"\n");

int j=2;
sum=0;
for(int i=0;i<3;i++)
{
sum=sum+ar[i][j];
j--;
}
System.out.print("secound digonal:"+sum);


}
}