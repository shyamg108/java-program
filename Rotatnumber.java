// Write a program rotate from 2 digit of any number as like 23456=56234

import java.util.*;
public class Rotatnumber
{
public static void main(String args[])
{
int n;
int k;
Scanner sc= new Scanner(System.in);
System.out.println("Enter any number:-");
n = sc.nextInt();
System.out.println("Rotate from Number:-");
k = sc.nextInt();
int temp=n;
int nod=0;
while(temp>0)
{
    temp=temp/10;
    nod++;
}
k = k % nod;
if(k<0)
{
k=k+nod;
}

int div=1;
int mult=1;
for(int i=0; i<=nod;i++)
{
    if(k<=0)
    div=div*10;
    else
    mult=mult*10;
}
int q=n/div;
int r= n%div;
System.out.println(q);
System.out.println(r);
int rot= r*mult + q;
} 
}
