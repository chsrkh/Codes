import  java.util.Scanner;
class Student
{
int ht,m,p,c;
String Name;
void Display(  )
{
System.out.println(" Student details are:");
System.out.println(" HT Num="+ht);
System.out.println(" Student Name ="+Name);
System.out.println(" Student Marks are:");
System.out.println("Maths= "+m+"\nPhy= "+p+"\nChem="+c);
}
int Total(int  x, int  y, int  z)
{
return  x+y+z;
}
double   Avg(int n)
{
return   (double)n/3;
}
}
class StdProg
{
public static void main(String args[ ])
{
int tot;
double avg;
Scanner s=new Scanner(System.in);
Student std=new Student(  );
System.out.println(" Enter student Ht Num:");
std.ht=s.nextInt( );
System.out.println(" Enter student Name:");
std.Name=s.next( );
System.out.println(" Enter student Marks:");
std.m=s.nextInt( );
std.p=s.nextInt( );
std.c=s.nextInt( );
tot=std.Total(std.m, std.p, std.c);
avg=std.Avg(tot);
std.Display( );
System.out.println("student  Total Marks:"+tot);
System.out.println("student Avg Marks:"+avg);
}
}





