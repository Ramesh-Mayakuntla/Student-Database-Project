package example;

public class AutoGeneratedID
{
	String id;
	static int count=101;

	public AutoGeneratedID()
	{
		this.id="184G1A0"+count;
		count++;
	}

	public static void main(String[] args)
	{
		AutoGeneratedID id1=new AutoGeneratedID();
		AutoGeneratedID id2=new AutoGeneratedID();
		AutoGeneratedID id3=new AutoGeneratedID();
		AutoGeneratedID id4=new AutoGeneratedID();

		System.out.println(id1.id);
		System.out.println(id2.id);
		System.out.println(id3.id);
		System.out.println(id4.id);
	}
}