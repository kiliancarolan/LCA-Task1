import java.util.ArrayList;
import java.util.Arrays;

public class DAG<Value> {

	public Node[] nodelist; // array to keep track of nodes

	private class Node 
	{
		private Value val;
		private Node[] child;
		private int childNumber;

		public Node(Value val, int childNumber) 
		{
			this.val = val;
			this.childNumber = childNumber;
		}

		int value;
	}

	// returns the size of graph
	public int size() 
	{
		return nodelist.length;
	}

	// Checks to see if Node n is in the graph
	public boolean contains(Node n) 
	{
		if (Arrays.asList(nodelist).contains(n) == true) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	public boolean isEmpty()
	{
		if(size()==0) 
			return true;
		else 
			return false;

	}

	//Adds a node to the graph
	public void add(Node n, Node from, Node to)
	{
		if(from.val!=null)
		{
			from.child = extendArrayByOne(from.child);
			from.child[from.child.length-1] = n;
		}

		if(to.val != null)
		{
			n.child = extendArrayByOne(n.child);
			n.child[n.child.length-1] = to;

		}

		nodelist = extendArrayByOne(nodelist);
		nodelist[nodelist.length-1] = n;	


	}

	public Node[] extendArrayByOne(Node[] firstArray)
	{
		Node[] arrayCopy = new DAG.Node[firstArray.length+1];
		System.arraycopy(firstArray,0,arrayCopy,0 , firstArray.length);
		return arrayCopy;
	}

}