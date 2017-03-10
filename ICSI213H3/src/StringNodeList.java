

public class StringNodeList
{	
	//Fields
	private int size = 0; 
	private StringNode root = null;
	private StringNode tail = null; 
	//private StringNode headNode; 
	//private StringNode tailNode; 
	//Add Method 
	public void insert(StringNode n)
	{
		StringNode temp = null; 
		if (root == null)
        {
               StringNode newNode = new StringNode(n.getData(),temp,temp);
                root = newNode;
        }
        else
        {
                StringNode currentNode = root;
                StringNode previous = null; 
                while(currentNode.getNext()!=null && n.getData().compareToIgnoreCase(currentNode.getData())>0)
                {
                	previous = currentNode; 
                    currentNode = currentNode.getNext();
            
                }
                if(currentNode.getNext()!=null)
                {
                	StringNode newNode = new StringNode(n.getData(),temp,currentNode);
                	currentNode.setPrevious(n);

                }
                else 
                {
                	if(n.getData().compareToIgnoreCase(currentNode.getData())<0 && currentNode == root)
                	{
                	StringNode newNode = new StringNode(n.getData(),temp,currentNode);
                	root = newNode; 
                	currentNode.setNext(temp);
                	currentNode.setPrevious(newNode);
                	}
                	else if (n.getData().compareToIgnoreCase(currentNode.getData())<0 && currentNode != root)
                	{
                    	StringNode newNode = new StringNode(n.getData(),previous,currentNode);
                    	previous.setNext(newNode);
                    	currentNode.setPrevious(newNode);

                	}
                	else
                	{
                    	StringNode newNode = new StringNode(n.getData(),currentNode,temp);
                    	currentNode.setNext(newNode);

                	}
                	
                }
            }
            size++;
    
		
	}
	public void traverseForward()
	    {
	    	StringNode currentNode = root; 
	    	while(currentNode.getNext()!=null)
	    	{
	    		System.out.println(currentNode);
	    		currentNode = currentNode.getNext();
	    	}
	    	System.out.println(currentNode);
	    	
	        
	    }
	public StringNode getRoot()

	 {
		 return root;
	 }
	public StringNode getTail()
	{
		StringNode current = root; 
		while(current.getNext()!=null)
		{
			current=current.getNext();
		}
		return current;
	}
	public void traverseBackward()
	{
		StringNode currentNode = getTail();
		while(currentNode.getPrevious()!=null)
		{
			System.out.println(currentNode);
			currentNode = currentNode.getPrevious();
		}
		System.out.println(currentNode);
	}
	public boolean findNode(StringNode n)
	{
		StringNode currentNode = root; 
		while(currentNode.getNext()!=null)
		{
			if(currentNode.getData().equals(n.getData()))
			{
				return true; 
			}
			currentNode = currentNode.getNext();
		}
		return false; 
	}
}