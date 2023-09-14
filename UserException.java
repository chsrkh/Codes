class MyException extends Exception
{
public MyException(String s)
{
super(s);
}
}
class UserException
{
public static void main(String args[ ])
{
int a=20,b=2,c;
try
{
if(a%b==0)
throw  new MyException(" Error occured. you cant devide a with b");
else
{
c=a+b;
System.out.println(" The add="+c);
}
}
catch(MyException e)
{
System.out.println(" Exeception occurred");
System.out.println(e.getMessage( ));
}
}
} 