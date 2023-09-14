class Unchecked
{
public static void main(String args[])
{
int a=100,b=10,c;
String str="abcdefg";
int[] numbers = {1, 2};
String invalidNumber = "5";
try
{
c=a/b;
System.out.println("The div of two numbers="+c);
int length = str.length();
System.out.print(" Given String length is="+length); 
int value = numbers[5]; 
System.out.println(" value from the array="+value);
int parsedNumber = Integer.parseInt(invalidNumber);
System.out.println(" The number="+invalidNumber);
}
catch(ArithmeticException e)
{
System.out.println(" You cant devide with zero");
}
catch(NullPointerException e)
{
System.out.println(" You cant assign null to a string");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println(" It is not available in the array");
}
catch(NumberFormatException e)
{
System.out.println(" You cant convert string to integer");
}
}
}