import java.util.ArrayList;

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
                	/*StringNode newNode = new StringNode(n.getData(),previous,currentNode);
                    previous.setNext(newNode);
                    currentNode.setPrevious(n);*/
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
	 public void iterate()
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
	/*public void alphabetizeList()
	{
		StringNode temp1 = root; 
		StringNode temp2 = temp1.getNext(); 
		if(temp2==null)
		{
			return; 
		}
		else 
		{
			int i =2; 
			StringNode temp3; 
			while(i<=size)
			{		
				
				if(temp1.getString().compareToIgnoreCase(temp2.getString()) <= 0)
				{
					size++;
					temp1 = temp2; 
					temp2 = temp2.getNext();
					if(temp2==null)
					{
						return;
					}
				}
				else
				{
					temp3 = temp2;
					temp1 = temp2; 
					temp2 = temp3; 
					size++;
				}
				temp3=null;

			}
			
			
		}
	}
	*/
	
	
	

}
