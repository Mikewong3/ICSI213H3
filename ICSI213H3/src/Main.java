
public class Main 
{
	public static void main (String[]args)
	{
		StringNodeList list = new StringNodeList();
		StringNode node = new StringNode("C");
		StringNode node2 = new StringNode("A");
		StringNode node3 = new StringNode("B");
		StringNode node4 = new StringNode("e");
		StringNode node5 = new StringNode("Z");
		StringNode find = new StringNode("e"); 
		StringNode find2 = new StringNode("F");
		//insert Nodes to a doubly link list
		list.insert(node);
		list.insert(node2);
		list.insert(node3);
		list.insert(node4);
		list.insert(node5);
		//prints the size of the doubly link list
		list.traverseForward();
		System.out.println();
		//prints out the doubly link list from the beginning 
		System.out.println("The size is: " + list.getSize());
		System.out.println();
		//prints out the doubly link list starting at the end 
		list.traverseBackward();
		System.out.println();
		//find the Node find & find2 in the doubly link list
		System.out.println(list.findNode(find)); 
		System.out.println(list.findNode(find2));
		System.out.println();
		//delete the Node find & find2 in the doubly link list
		list.deleteNode(find);
		list.deleteNode(find2);
		//prints out the doubly link list from the beginning 
		list.traverseForward();
		//prints the size of the doubly link list
		System.out.println("The size is: " + list.getSize());
		System.out.println();
		//deletes the entire doubly link list 
		list.deleteList();
		System.out.println();
		//prints the size of the doubly link list
		System.out.println("The size is: " + list.getSize());
		//insert a node in a new doubly link list
		list.insert(node);
		System.out.println();
		//prints out the doubly link list from the beginning 
		list.traverseForward();
		//prints the sieze of the new doubly link list
		System.out.println();
		System.out.println("The size is: " + list.getSize());


		
	}

}
