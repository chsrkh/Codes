import java.io.*;
class Checked
{
public static void main(String[] args)
{
try
{
FileReader fr = new FileReader("c:\\java\\Hello.txt");
BufferedReader br = new BufferedReader(fr);
String line;
while ((line = br.readLine()) != null)
 {
  System.out.println(line);
 }
Class cls=Class.forName("ABC");
}
catch(ClassNotFoundException e)
{
System.out.println("The class you are looking is not found ");
}
catch(FileNotFoundException e)
{
System.out.println(" File not found:"+e.getMessage());
}
catch(IOException e)
{
System.out.println(" Data not found in file:"+e.toString());
}
}
}
