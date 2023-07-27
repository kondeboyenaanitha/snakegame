import java.util.Scanner;
class RP
{
int a,b;
void sum()
{
Scanner ob=new Scanner(System.in);
System.out.println("Enter two values");
a=ob.nextInt();
b=ob.nextInt();
System.out.println("sum is by runtime poly"+(a+b));
}
}
class RP2 extends RP
{
void sum()
{
int a=20,b=30;
System.out.println("sum by child class"+(a+b));
super.sum();
}
}
class RPex
{
public static void main(String args[])
{
RP2 t=new RP2();
t.sum();
}
}

