

public class StringNodeList
{	
	//Fields
	private int size = 0; 
	private StringNode root = null;
	private StringNode tail = null; 
	//private StringNode headNode; 
	//private StringNode tailNode; 
	//insert method; adds a StringNode alphabetically to the doubly linked list
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
	//prints the doubly linked list from the beginning to the end 
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
	//returns the root of the doubly linked list 
	public StringNode getRoot()
	 {
		 return root;
	 }
	//return the tail of the doubly linked list
	public StringNode getTail()
	{
		StringNode current = root; 
		while(current.getNext()!=null)
		{
			current=current.getNext();
		}
		return current;
	}
	//prints the doubly linked list from the end to the beginning 
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
	//return a boolean statement if the parameter StringNode is found in the doubly linked list 
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
	//Delete the StringNode parameter from the doubly linked list
	public void deleteNode(StringNode n)
	{
		StringNode currentNode = root; 
		StringNode temp = null; 
		while(currentNode.getNext()!=null)
		{
			if(currentNode.getData().equals(n.getData()))
			{
				if(currentNode==root)
				{
					root=root.getNext();
					root.setPrevious(temp);
					return;
				}
				currentNode.getNext().setPrevious(currentNode.getPrevious());
				currentNode.getPrevious().setNext(currentNode.getNext());
				size--;
				System.out.println("The Node was deleted");
				return;
			}
			currentNode = currentNode.getNext();
		}
		System.out.println("The Node was not found");
		
	}
	//delete the entire doubly linked list 
	public void deleteList()
	{
		StringNode currentNode = root; 
		StringNode tail = getTail();
		root = null;
		tail = null; 
		System.out.print("The List is deleted");
		size=0; 
		/*while(currentNode.getNext()!=null)
		{
			currentNode.setPrevious(temp);
			
			
		}
		currentNode.setPrevious(temp);
		System.out.println("The list is deleted");
		*/
		
	}
	//return size of the doubly linked list 
	public int getSize()
	{
		return size; 
	}
}