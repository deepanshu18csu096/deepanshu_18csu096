import java.lang.*;
class Except1
{
	public static void main(String[] args) 
	{
		try
		{
			String exMessage="Not Valid";
			throw new Exception(exMessage);-
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	
		finally
		{
			System.out.println("It will get printed.");	
		}
	}
}