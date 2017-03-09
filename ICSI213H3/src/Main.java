
public class Main 
{
	public static void main (String[]args)
	{
		StringNodeList list = new StringNodeList();
		StringNode node = new StringNode("Cat");
		StringNode node2 = new StringNode("Ate");
		StringNode node3 = new StringNode("Bate");
		StringNode node4 = new StringNode("eER");
		StringNode node5 = new StringNode("Zate");


		
		list.insert(node);
		list.insert(node2);
		list.insert(node3);
		list.insert(node4);
		list.insert(node5);
		list.traverseForward();

		
		//System.out.print(list.getRoot());
		//System.out.print(list.getRoot().getNext());
		
		//System.out.println("Length : "+list.size());
		
		/*StringNode node3 = new StringNode(3, "Glass");
		StringNode node4 = new StringNode(4, "Pen");
                list.add(node3);
		System.out.println("Length : "+list.size());
                if(list.findNode(node3))
                    System.out.println("Node found: "+node3.getName());
                else
                    System.out.println("Node not found: "+node3.getName());
                if(list.findNode(node4))
                    System.out.println("Node found: "+node4.getName());
                else
                    System.out.println("Node not found: "+node4.getName());
                
                list.iterate();
                */
	}

}
