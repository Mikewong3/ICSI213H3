
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
	public StringNode()
	{
		data = "";
		id = 0; 
		next = null; 
		previous = null; 
	}
	
	public String getData()
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
	public void setData(String n)
	{
		data = n; 
	}
	public void setID(int i)
	{
		id = i; 
	}
	public String toString()
	{
		return this.getID()+ ": " + this.getData();
	}

}
