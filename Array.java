import java.util.Scanner;
class Array
{
public static void main(String args[])
{
int[ ][ ]   a=new int[3][2];
int  i,j;
Scanner    s=new Scanner(System.in);
System.out.println(" Enter values into array a:");
for(i=0;i<3;i++)
{
for(j=0;j<2;j++)
{
a[i][j]=s.nextInt();
} 
}
System.out.println(" values from array a:");
for(i=0;i<5;i++)
{
System.out.println("  "+a[i]);
}
}
}






