import java.util.Scanner;

/*
Suppose you are planning to go to park so you are going to check tickets criteria online. The
        ticket rates details have been given
        *If children below 10 are not allowed to swing
        *If age is between 10 to 15 allowed to swing and getting 10 % discount
        *If age is between 15 to 20 allowed to swing and getting 5 % discount
        *If age is more than 20 not then not eligible for swing and discount
        The age of person will run until you enter the age of last family member and then calculate the
        total charge amount after entering each person’s age. Assume price of ticket is 100 Rs. each
        person.
 */
class people {
    String name;
    int age;

    public people(String name, int age)
     {
        this.name = name;
        this.age = age;
    }
}

class TCounter{
    final static int perticketfee = 100;

    public static double getTicket(people p){
        double price = 0;
        System.out.print("Name = " + p.name + ", age =  " + p.age + "  ");
        if (p.age < 10){
            System.out.println("not allowed to swing");
        }else if (p.age >= 10 && p.age <= 15) {
            price = perticketfee + (perticketfee / 10);
            System.out.println(price);
        }else if(p.age > 15 && p.age <= 20){
            price =perticketfee + (perticketfee / 20);
            System.out.println(price);
        }else{
            System.out.println("not eligible");
        }
        return price;
    }

    public static double collectionPrice(people[] p)
    {
        double tot = 0.0;
        for (int i = 0; i < p.length; i++) {
            tot = tot + getTicket(p[i]);
        }
        return tot;
    }
}

public class Ticket{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int age;
        System.out.print("Enter family member:- ");
        int num = sc.nextInt();

        people[] Members = new people[num];

        for (int i = 0; i < num; i++)
         {
            System.out.print("Enter name of person:- ");
            name = sc.next();
            System.out.print("Enter age of person:- ");
            age = sc.nextInt();
            Members[i] = new people(name, age);
        }

        double tot = TCounter.collectionPrice(Members);
        System.out.println("*********************************************");
        System.out.println("Total Ticket price:- "+tot);
    }
}
