import java.net.*;
import java.io.*;
class Server
{
public static void main(String args[]) 
{
try{

ServerSocket ss=new ServerSocket(4999);
Socket s=ss.accept();
System.out.println(" Yeah! server is connected to client.");
InputStreamReader ir=new InputStreamReader(s.getInputStream());
BufferedReader br=new BufferedReader(ir);
String txt=br.readLine();
System.out.println(" Server: Welcome "+txt);
PrintWriter pr=new PrintWriter(s.getOutputStream());
pr.println(" Hello");
pr.flush();
}
catch(IOException e)
{
System.out.println(" Error Occured:"+e.getMessage());
}
}
}