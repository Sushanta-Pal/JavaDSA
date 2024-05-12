class First extends Thread
{
int j;
         First(int k)
            {
                j=k;
            }
public void run()
{
call();
}
 void call()
{
 try{
for(int i=1;i<=10;i++)
{
System.out.println(j+"X"+i+"="+i*j);
Thread.sleep(100);
}
}
catch(Exception e)
{  }

}
}
class Ass65
{
public static void main(String arg[])
{
System.out.println("Main begins");
System.out.println(" Go back to other thread" );
First t1=new First(2);
First t2=new First(3);
First t3=new First(4);
      try{

t1.start();
t1.join();

t2.start();
t2.join();

t3.start();
t3.join();
}
catch(InterruptedException e)
{  }
System.out.println("Come back in main thread");
try{
for(int k=1;k<=10;k++)
{
System.out.println("Main"+k);
Thread.sleep(100);
}
}
catch(Exception e)
{ }
System.out.println("Exit main");
}
}

