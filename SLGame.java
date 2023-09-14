import java.util.Random;
import java.util.Scanner;
class  SLGame
{
public static void main(String args[ ])
{
Random r=new Random( );
Scanner s =new Scanner(System.in);
int d, p1=0, p2=0, n;
boolean i=true; 
while( i )
{
System.out.println("Enter Player Num:");
n=s.nextInt( );
if(n==1)
{	d=r.nextInt(6);
	System.out.println("Dice score="+d );
	p1=p1+d;
	if(p1==7)
	p1=p1+5;
	else if(p1==19)
	p1=p1+23;
	else if(p1==32)
	p1=p1+33;
	else if(p1==58)
	p1=p1+30;
	else if(p1==76)
	p1=p1+20;
	else if(p1==17)
	p1=p1-11;
	else if(p1==45)
	p1=p1-22;
	else if(p1==52)
	p1=p1-35;
	else if(p1==72)
	p1=p1-40;
	else if(p1==97)
	p1=p1-70;
	else if(p1>100)
	p1=p1-d;
	else if(p1==100)
	{
	i=false;
	System.out.println("Player 1 is winner");
	}    
	System.out.println("Player 1 Score:"+p1);
	System.out.println("Player 2 Score:"+p2);
}
else if(n==2)
{
d=r.nextInt(6);
	System.out.println("Dice score="+d );
	p2=p2+d;
	if(p2==7)
	p2=p2+5;
	else if(p2==19)
	p2=p2+23;
	else if(p2==32)
	p2=p2+33;
	else if(p2==58)
	p2=p2+30;
	else if(p2==76)
	p2=p2+20;
	else if(p2==17)
	p2=p2-11;
	else if(p2==45)
	p2=p2-22;
	else if(p2==52)
	p2=p2-35;
	else if(p2==72)
	p2=p2-40;
	else if(p2==97)
	p2=p2-70;
	else if(p2>100)
	p2=p2-d;
	else if(p2==100)
	{
	i=false;
	System.out.println("Player 2 is winner");
	}
	System.out.println("Player 1 Score:"+p1);
	System.out.println("Player 2 Score:"+p2);

}
else 
System.out.println("Enter valid player number.");
}
}
}                                      