 class Exe
{
public static void main(String args[  ])
{
int a=10,b=0;
double c;
try
{
c=a/b;
System.out.println(" The div="+c);
}
catch(ArithmeticException e)
{
System.out.println(" You cant devide with zero");
}
}
}
