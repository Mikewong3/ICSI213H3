

public class StringNodeList
{	
	//Fields
	private int size = 0; 
	private StringNode root = null;
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
	    		System.out.print(currentNode);
	    		currentNode = currentNode.getNext();
	    	}
	    	System.out.print(currentNode);
	    	
	        
	    }
	 public StringNode getRoot()
	 {
		 return root;
	 }
}