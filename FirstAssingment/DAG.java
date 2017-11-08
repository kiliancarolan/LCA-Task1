import java.util.Arrays;

public class DAG <Value> {
	//DAG Branch
	private Node[] nodelist;


	private class Node{
		private Value val;
		private Node[] child;

		public Node(Value val){
			this.val = val;
		}
		int value;
	}

	public boolean isEmpty(){
		if(size()==0) return true;
		else return false;

	}
	//Number of nodes in graph
	public int size(){
		return nodelist.length;
	}

	//Checks for Node n in the graph
	public boolean contains(Value v){
		boolean valPresent = false;
		for(int i =0; i<nodelist.length;i++){
			if(nodelist[i].val==v){
				valPresent = true;
				break;
			}
		}
		return valPresent;
	}


	//Adds a node to the graph
	public void put(Value v, Value fromVal, Value toVal){
		Node n = new Node(v);

		Node from = retrieveNodefromVal(fromVal);
		Node to = retrieveNodefromVal(toVal);


		if(fromVal != null){
			n.child = extendArrayByOne(n.child);
			n.child[n.child.length-1] = n;
			if(from.val == null){
				addNodeToNodeList(from);
			}
		}

		if(toVal != null){
			n.child = extendArrayByOne(n.child );
			n.child [n.child .length-1] = to;
		}
		if(to.val ==null){
			addNodeToNodeList(to);
		}

	}


	public void addNodeToNodeList(Node n){
		nodelist = extendArrayByOne(nodelist);
		nodelist[nodelist.length-1]= n;

	}
	public Node[] extendArrayByOne(Node[] originalArray){
		Node[] copyArray = new DAG.Node[originalArray.length+1];
		System.arraycopy(originalArray,0,copyArray,0 , originalArray.length);
		return copyArray;
	}

	public void deleteNode(Node n){
		int i;
		for (i=0; i<n.child .length;i++){
			n.child [i] = null;
		}

		for(i=0; i<nodelist.length;i++){
			if(Arrays.asList(nodelist[i].child ).contains(n)== true){
				for(int j = 0; j<nodelist[i].child .length;j++){
					if(nodelist[i].child [j]==n){
						nodelist[i].child  = null;
					}
				}
			}
		}

		for (int k=0; k<nodelist.length;k++){
			if(nodelist[k]==n){
				nodelist[k] = null;
			}
		}
	}

	public Node retrieveNodefromVal(Value v){
		Node returnNode= new Node(null);
		for(int i=0; i<nodelist.length;i++){
			if(nodelist[i].val ==v){
				returnNode = nodelist[i];
				break;
			}
		}
		return returnNode;
	}

}