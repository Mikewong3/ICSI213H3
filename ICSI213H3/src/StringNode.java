
public class StringNode 
{
	private String data; 
	private int id; 
	private StringNode next; 
	
	public StringNode(String data,int id)
	{
		this.data=data; 
		this.id=id; 
		next = null; 
	}
	
	public String getString()
	{
		return data; 
	}
	public int getID()
	{
		return id; 
	}
	public StringNode getNext()
	{
		return next; 
	}
	public void setString(String n)
	{
		data = n; 
	}
	public void setID(int i)
	{
		id = i; 
	}
	public String toString()
	{
		return this.getID()+ ": " + this.getString();
	}

}
