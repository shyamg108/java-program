import java.util.*;
public class contdigit
 {
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number:-");
        n=sc.nextInt();
        int dig=0;
        while(n!=0)
        {
            n=n/10;
            dig++;
        }
        System.out.println("Total number of digites:-"+dig);

    }
    
}
