class MyExe extends Exception
{
public MyExe(String s)
{
super(s);
}
}
class MainExe
{
public static void main(String args[ ])
{
try
{
throw new MyExe(" Hello ");
}
catch(MyExe e)
{
System.out.println(" Exception Occured");
System.out.println(e.getMessage( ));
}
}
}