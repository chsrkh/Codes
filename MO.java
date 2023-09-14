class A
{
int Arith(int  x,int  y)
{
int z;
z=x+y;
return z;
}
}
class B extends A
{
int Arith(int  x, int  y)
{
int z;
z=x-y;
return z;
}
}
class C extends A
{
int Arith(int  x, int  y)
{
int z;
z=x*y;
return z;
}
}
class MO
{
public static void main(String args[ ])
{
int res;
A  obja = new A( );
B objb = new B( );
C  objc =  new C( );
res=obja.Arith(12,5);
System.out.println(" The Result="+res);
res=objb.Arith(12, 3);
System.out.println(" The Result="+res);
res=objc.Arith(10, 4);
System.out.println(" The Result="+res);
}
}
