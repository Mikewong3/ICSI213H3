
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

		list.insert(node);
		list.insert(node2);
		list.insert(node3);
		list.insert(node4);
		list.insert(node5);
		list.traverseForward();
		System.out.println();
		list.traverseBackward();
		System.out.println();
		System.out.println(list.findNode(find)); 
		System.out.println(list.findNode(find2));
		System.out.println();
		list.deleteNode(find);
		list.traverseForward();
		System.out.println();
		list.deleteList();
		System.out.println();
		list.insert(node);
		System.out.println();
		list.traverseForward();

		
	}

}
