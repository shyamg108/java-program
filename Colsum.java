
import java .util.Scanner;
public class Colsum {
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("Entern the number of columns:");
        int cols = obj.nextInt();
        int arr[] = new int [cols];
        for (int i = 0; i < cols; i++) {
            int cSum = 0;
    
        
         cSum += arr[i];
        
            System.out.println("Column " + (i + 1) + " sum = " + cSum);
        }
                
                
        
    }
    

    
}
