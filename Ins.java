 class A
 {
 int  a, b;
 int Add( )
 {
 int c;
 c=a+b;
 return c;
 }
 }
 class B 
 {
int  x, y;
 int Sub( )
 {
 int c;
 c=x-y;
 return c;
}
}
class C
{
int Mul( )
{
int z;
z=x*y;
return z;
}
}
class Ins
{
public static void main(String args[ ])
{
int res;
B    objb=new B( );
C    objc=new C( );
objb.a=10;
objb.b=20;
res=objb.Add( );
System.out.println(" The add="+res);
objb.x=40;
objb.y=30;
res=objb.Sub( );
System.out.println(" The sub="+res);
objc.x=200;
objc.y=100;
res=objc.Mul( );
System.out.println(" The Mul="+res);
}
}




