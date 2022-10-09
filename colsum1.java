import java.util.Scanner;
public class colsum1
{
public static void main(String[] args)
{
Scanner in = new Scanner(System.in);
int n,m,i,j,s;
System.out.println("Enter the size of the 2d array row and column respectively");
n = in.nextInt();
m = in.nextInt();
int A[][] = new int[n][m];
int B[] = new int[m];
System.out.println("Enter the array elements");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
A[i][j] = in.nextInt();
}
}
System.out.println("The array you have Entered");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
System.out.print(A[i][j]+" ");
}
System.out.println();
}
for(i=0;i<n;i++)
{
s=0;
for(j=0;j<m;j++)
{
s = s + A[j][i];
B[i] = s;
}
}
for(i=0;i<m;i++)
System.out.print(+B[i]+" ");
System.out.println("The sum according to the format");
}
}