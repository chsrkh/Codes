class A
{
int a,b;
int Add( )
{
int c;
c=a+b;
return c;
}
}
class B extends A
{
int Sub( )
{
int c;
c=a-b;
return c;
}
}
class C extends A
{
int Mul( )
{
int c;
c=a*b;
return c;
}
}
class D extends A
{
double Div( )
{
double c;
c=(double)a/b;
return c;
}
}
class HI
{
public static void main(String args[ ])
{
int res;
double r;
B objb = new B( );
C objc = new C( );
D objd = new D( );
objb.a=20;
objb.b=10;
res=objb.Add( );
System.out.println(" The add ="+res);
res=objb.Sub( );
System.out.println(" The sub ="+res);
objc.a=25;
objc.b=4;
res=objc.Mul( );
System.out.println(" The Mul ="+res);
objd.a=500;
objd.b=3;
r=objd.Div( );
System.out.println(" The Div ="+r);
}
}
