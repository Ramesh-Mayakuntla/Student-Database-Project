package CustomException;

public class InvalidChoiceException extends Exception
{
	String message;
	
	public InvalidChoiceException(String message)
	{
		this.message=message;
	}
	
	public String toString()
	{
		return message;
	}
}
