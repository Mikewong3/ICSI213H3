
public class StringNode 
{
	private String data; 
	private int id; 
	private StringNode next; 
	private StringNode previous; 
	
	public StringNode()
	{
		data = "";
	}
	public StringNode(String data)
	{
		this.data = data;
		id = 0; 
	}
	public StringNode(String data, StringNode previous, StringNode next) 
	{
		this.data=data; 
		this.next = next;  
		this.previous = previous; 
	}
	//public StringNode(String data,StringNode next)
	

	
	
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
	public void setNext(StringNode n)
	{
		this.next=n; 
	}
	public void setPrevious(StringNode n)
	{
		this.previous=n;
	}
	public void setID(int i)
	{
		id = i; 
	}
	public String toString()
	{
		return this.getData();
	}

}
