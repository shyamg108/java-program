class Box{
    private  int length ,width,height;
    public  void setDimension(int l,int b,int h ){
        length=l;width=b;height=h;
    }
    public void showDimension()
    {
        System.out.println("L="+length);
        System.out.println("B="+width);
        System.out.println("H="+height);
    }
}

class Exampleclass
{


    public static void main(String args[])
    {
       Box smallBox= new Box();
       smallBox.setDimension(25,46,34);
       smallBox.showDimension();
       smallBox=new Box();
       smallBox.showDimension();
    }
    
}
