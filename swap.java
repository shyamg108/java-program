public class swap {
 public static void main(String[] args) 
 {
     int x = 20;
     int y = 30;
     swapfuntion(x, y);
        
    }
    public static void swapfuntion(int a,int b)
    {
        System.out.println("Oringnal number a:"+a+ "  b: "+b);
        int c=a;
        a=b;
        b=c;
        System.out.println("Swapped number a:"+a+ "  b: "+b);
    }
    
}
