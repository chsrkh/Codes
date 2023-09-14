class A
{
int a,b;
A( ) //default constructor
{
a=10;
b=20;
}
A( int x)
{
a=x;
b=40;
}
A(int  x, int  y)
{
a=x;
b=y;
}
int Add( )
{
int c;
c=a+b;
System.out.println(" The add="+c);
return c;
}
}
class Abcd
{
public static void main(String args[ ])
{
A obj1 = new A( );
A obj2 = new A(30);
A obj3 = new A(60,70);
obj1.Add( );
obj2.Add( );
obj3.Add( );
}
} 
 





 















