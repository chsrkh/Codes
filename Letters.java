/*1.  isLetter()
2.  isDigit()
3. isLower()
4. isUpper()
5. isWhiteSpace()
*/
import   java.util.Scanner;
class Letters
{
public static void main(String args[])
{
Scanner  s=new Scanner(System.in);
String s1;
int i;
System.out.println(" enter string:");
s1=s.next();
System.out.println(" The lower case letters are:");
for(i=0;i<s1.length();i++)
{
if(Character.isLowerCase(s1.charAt(i)))
System.out.println(" "+s1.charAt(i));
 }
 }
  }



