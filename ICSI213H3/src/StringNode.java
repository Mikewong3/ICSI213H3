
public class StringNode 
{
	//created private fields 
	private String data; 
	private int id; 
	private StringNode next; 
	private StringNode previous; 
	
	//default constructor 
	public StringNode()
	{
		data = "";
	}
	//constructor with a string parameter 
	public StringNode(String data)
	{
		this.data = data;
		id = 0; 
	}
	//constructor with string, StringNode next, and StringNode next parameter
	public StringNode(String data, StringNode previous, StringNode next) 
	{
		this.data=data; 
		this.next = next;  
		this.previous = previous; 
	}
	//return the data of the Node 
	public String getData()
	{
		return data; 
	}
	//return the ID of the Node
	public int getID()
	{
		return id; 
	}
	//return the StringNode next of the current Node 
	public StringNode getNext()

	{
		return next; 
	}
	//return the StringNode previous of the current Node 
	public StringNode getPrevious()
	{
		return previous; 
	}
	//set the data of the Node with a String parameter 
	public void setData(String n)
	{
		data = n; 
	}
	//set the nextNode with a StringNode parameter 
	public void setNext(StringNode n)
	{
		this.next=n; 
	}
	//set the previous Node with a StringNode parameter 
	public void setPrevious(StringNode n)
	{
		this.previous=n;
	}
	//set the id of the node with a int parameter 
	public void setID(int i)
	{
		id = i; 
	}
	//the toString for the Node 
	public String toString()
	{
		return this.getData();
	}

}
