interface i1
{
void f1();
}
class First implements i1
{
void f2()
{
System.out.println("World");
}
public void f1()
{
System.out.println("Hi");
}
}
class  Interface
{
public static void main(String args[])
{
First st = new First();
st.f1();
st.f2();

}
}