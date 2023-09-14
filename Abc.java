/* java program to import user defined packages*/
import   Pack1.A1;
import   Pack2.A2;
class ABC
{
public static void main(String args[ ])
{
int res;
A1  obja = new A1( );
A2  objb = new A2( );
obja.Text( );
res=obja.Add( 25 , 75);
System.out.println(" The add = "+res);
objb.Disp( );
res=objb.minimum(10,25);
System.out.println(" The minimum = "+res);
}
} 