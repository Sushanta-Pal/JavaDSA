class MyException extends Exception
{	MyException(String msg)
	{	super(msg);
	}
}
class Check
{	int a,b;
	Check(int imarks,int emarks)
	{	a= imarks;
		b= emarks;
	}
	public void display1() throws MyException
	{	if(a<0||a>30) throw new MyException("INVALID INTERNAL MARKS");
		else
		{	System.out.println("Internal Marks given: "+a);
		}
	}
	public void display2() throws MyException
	{	if(b<0||b>70) throw new MyException("INVALID EXTERNAL MARKS");
		else
		{	System.out.println("External Marks given: "+b);
		}
	}
}
class ASS53
{	public static void main(String arg[])
	{	Check c=new Check(45,65);
		try{
			try{	
				c.display1();
			}
			catch(MyException e)
			{	System.out.println(e.getMessage());
			}
			try{	
				c.display2();
			}
			catch(MyException e)
			{	System.out.println(e.getMessage());
			}
		}
		finally{
			System.out.println("END OF PROGRAM");
		}	}
    }

