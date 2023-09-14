class Threads  extends Thread
{
String Name;
Thread t;
Threads(String Name)
{
this.Name=Name;
t=new Thread(this, Name);
t.start();
}
public void run()
{
try
{
for(int i=1;i<=10;i++)
{
System.out.println(Name +":"+i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println(Name +" is Interrupted");
}
System.out.println(Name +" is exiting.");
}
}
class ThreadProg
{
public static void main(String args[])
{
Threads t1=new Threads("One");
Threads t2=new Threads("Two");
t1.start();
t2.start();
}
}    