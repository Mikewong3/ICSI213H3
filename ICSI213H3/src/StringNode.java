
public class StringNode 
{
	private String data; 
	private int id; 
	private StringNode next; 
	private StringNode previous; 
	
	public StringNode(String data,int id,StringNode previous)
	{
		this.data=data; 
		this.id=id; 
		next = null; 
		this.previous = previous; 
		
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
	public StringNode getPrevious()
	{
		return previous; 
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
