import  java.util.Scanner;
class Str
{
public static void main(String args[])
{
String s1="Santhiram Engg College";
String s2,s3;
Scanner   s=new Scanner(System.in);
System.out.println(" The string s1="+s1);
System.out.println(" The second char of s1="+s1.charAt(1));
System.out.println(" The len of s1="+s1.length());
System.out.println(" Enter string s2:");
s2=s.next();
System.out.println(" The string 2="+s2);
System.out.println(" The uppercase of s1="+s1.toUpperCase());
System.out.println(" The lowercase of s1="+s1.toLowerCase());
System.out.println(" The concatination of string s1 and s2="+s1.concat(s2));
s3="NANDYAL";
if(s3.equalsIgnoreCase(s2))
System.out.println(" Two strings are equal");
else
System.out.println(" Two strings are not  equal");
  }
  }
  