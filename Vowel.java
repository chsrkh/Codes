import java.util.Scanner;
class  Vowel
{
public static void main(String[] args)
{
char[ ]  c=new char[5];
String st;
int   i;
Scanner  s=new Scanner(System.in);
System.out.println(" Enter any five  chars:");
for(i=0;i<5;i++)
{
c[i]=s.next().charAt(0);
}
System.out.println(" Enter any string:");
st=s.next();
System.out.println(" vowels from char array:");
for(i=0;i<5;i++)
{
if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
System.out.println("  "+c[i]);
}
System.out.println(" vowels from string:");
for(i=0;i<st.length();i++)
{
if(st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||
st.charAt(i)=='o'||st.charAt(i)=='u')
System.out.println("  "+st.charAt(i));
}
}
}
