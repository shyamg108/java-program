import java.util.*;

interface A1{
void fun1();
}

interface A2{
void fun2();
}

class B1 implements A1,A2{

@Override
public void fun1() {
System.out.println("fun1 from class B1");
}

@Override
public void fun2() {
System.out.println("fun2 from class B1");
}
}
 class Demo {
public static void main(String[] args) {
B1 b1 = new B1();
b1.fun1();
b1.fun2();
}
}