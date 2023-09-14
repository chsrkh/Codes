interface A
{
public void IA( );
}

interface B
{
public void IB( );
}

class C implements A, B
{
	public void IA( )
	{
	System.out.println(" This text from Interface A");
	}
	public void IB( )
	{
	System.out.println(" This text from Interface B");
	}
void CC( )
{
System.out.println(" This text from Class C");
}
}
class MI
{
public static void main(String args[ ])
{
C objc = new C( );
objc.IA( );
objc.IB( );
objc.CC( );
}
}                             
