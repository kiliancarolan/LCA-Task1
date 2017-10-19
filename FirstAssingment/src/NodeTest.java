import static org.junit.Assert.*;

import org.junit.Test;

public class NodeTest {

	@Test
	public void testCorrectLCAWhenRootNodesAreBigger() {
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        int n1 = 10, n2 = 14;
        Node t = tree.lca(tree.root, n1, n2);
        assertEquals("cheking for correct lowest ancestor",12,t.data);
	}
	@Test
	public void testCorrectLCAWhenRootNodesAreSmaller()
	{
		BinaryTree tree = new BinaryTree();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.right.left=new Node (9);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        tree.root.left.right.left = new Node(4);
        tree.root.left.right.right = new Node(7);
        tree.root.right.right=new Node(14);
        tree.root.right.right.left=new Node(13);
        tree.root.right.right.right=new Node(15);
        
        int n1 =9, n2 = 15;
        Node t = tree.lca(tree.root, n1, n2);
        assertEquals("cheking for correct lowest ancestor",10,t.data);
	}
	// if (node.data < n1 && node.data < n2) 
         //return lca(node.right, n1, n2);

}
