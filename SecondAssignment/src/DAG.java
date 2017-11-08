import java.util.ArrayList;

public class DAG <Value> {

		
		public class Node{
			private Value val;
			private Node[] child;
			private int childNumber;
			
			public Node(Value val, int childNumber){
				this.val = val;
				this.childNumber = childNumber;
			}
			int value;
		}
		
	

		
}