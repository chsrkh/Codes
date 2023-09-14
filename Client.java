import java.net.*;
import java.io.*;
class Client
{
public static void main(String args[])
{
try
{
Socket s=new Socket("localhost",4999);
PrintWriter pr=new PrintWriter(s.getOutputStream());
pr.println(" Hi");
pr.flush();
InputStreamReader ir=new InputStreamReader(s.getInputStream());
BufferedReader br=new BufferedReader(ir);
String txt=br.readLine();
System.out.println(" Server: Welcome "+txt);
}
catch(IOException e)
{
System.out.println(e.getMessage());
}
}
}
