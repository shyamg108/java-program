public class function2 {
    public static void main(String[] args) 
    {
        function2 obj = new function2();
        int x = 20;
        int y = 40;
        
        int get_result= obj.sum(x, y);
        System.out.println(get_result);
    
    }
    public int sum(int num1,int num2)
    {
        int result = num1 + num2;
        return result;
    }
    
}
