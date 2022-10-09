import java.util.Scanner;
public class digosum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);


System.out.println("Enter the rows of matrix");
int rows = sc.nextInt();
System.out.println("Enter the columns of matrix");
int columns = sc.nextInt();

int[][] arr = new int[rows][columns];
int sum1 =0;
int sum2 =0;
for (int i =0 ; i < rows ; i++){
for (int j =0 ; j <columns ; j++){
arr[i][j] = sc.nextInt();
}
}

for (int i =0 ; i < rows ; i++){

for (int j =0 ; j <columns ; j++){
if(i==j){
sum1+=arr[i][j];
}
else{
continue;
}
sum2+=arr[i][columns-i-1];
}
}
System.out.println(sum1);
System.out.println(sum2);
}
}