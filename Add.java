import java.util.Scanner; 
class Add
{
public static void main(String args[])
{
float  a, b, c;
Scanner s=new Scanner(System.in);
System.out.println(" Enter  value of a:");
a=s.nextFloat();
System.out.println(" Enter  value of b:");
b=s.nextFloat();
c=a+b;
System.out.println(" The add of a,b ="+c);
}
}
