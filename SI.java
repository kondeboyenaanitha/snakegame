import java.util.Scanner;
class A
{
int a,b;
void input(){

Scanner ob=new Scanner(System.in);
System.out.println("Enter two values");
a=ob.nextInt();
b=ob.nextInt();
}
}
class B extends A
{
void gl()
{
if(a>b)
{
System.out.println(a+"greater than"+b);
}
if(b>a)
{
System.out.println(b+"is greater than"+a);
}
else{
System.out.println("equal");
}
}
}
class SI
{
public static void main(String args[])
{
B ob1=new B();
ob1.input();
ob1.gl();
}
}