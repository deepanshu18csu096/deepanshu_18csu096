import java.lang.*;
public class Ex2 
{	
	public static void main(String[] args) 
	{
		try 
		{
			Integer i = null;		
			System.out.println(i.toString());
		} 
		catch(NullPointerException e)
		{
			System.out.println("Caught NullPointerException");
		} 
	}	
}