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

}