import static org.junit.Assert.*;

import org.junit.Test;

public class DAGTest {

	@Test
	public void test() {

	}

	@Test
	public void testDAG_contains() {
		DagFunctionality graph = new DagFunctionality(3);

		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);

		assertTrue("Checks if graph contains certain directed edge.", graph.containsEdge(1, 2));
		assertTrue("Checks if graph contains certain directed edge.", graph.containsEdge(1, 3));
		assertTrue("Checks if graph contains certain directed edge.", graph.containsEdge(2, 3));
		assertFalse("Checks if graph contains certain directed edge.", graph.containsEdge(5, 6));

		graph.removeEdge(2, 3);
		assertFalse("Checks if graph still contains a removed edge.", graph.containsEdge(2, 3));
	}

	@Test
	public void testDAG_isEmpty() {
		DagFunctionality graph1 = new DagFunctionality(0);
		assertTrue("Checks if given graph is empty", graph1.isEmpty());

		DagFunctionality graph2 = new DagFunctionality(1);
		assertFalse("Checks if given graph is not empty", graph2.isEmpty());
	}

	@Test
	public void testDAG_hasCycle() {
		DagFunctionality graph = new DagFunctionality(7);
		graph.addEdge(2, 1);
		graph.addEdge(3, 2);
		graph.addEdge(4, 3);
		graph.addEdge(7, 4);
		graph.addEdge(7, 6);
		graph.addEdge(6, 5);
		graph.addEdge(5, 2);
		assertFalse("Checks if graph has any cycles.", graph.hasCycle());

	}

	@Test
	public void testDAG_LowestCommonAncestor() {
		DagFunctionality graph = new DagFunctionality(7);
		graph.addEdge(2, 1);
		graph.addEdge(3, 2);
		graph.addEdge(4, 3);
		graph.addEdge(7, 4);
		graph.addEdge(7, 6);
		graph.addEdge(6, 5);
		graph.addEdge(5, 2);

		assertEquals("Checks the lowest common ancestor of two nodes in DAG.", 2, graph.lowestCommonAncestor(6, 3));
		assertEquals("Checks the lowest common ancestor of two nodes in DAG.", 1, graph.lowestCommonAncestor(1, 2));
		assertEquals("Checks the lowest common ancestor of two nodes in DAG.", 6, graph.lowestCommonAncestor(6, 7));
	}

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
		assertEquals("cheking for correct lowest ancestor", 12, t.data);
	}

	@Test
	public void testCorrectLCAWhenRootNodesAreSmaller() {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(8);
		tree.root.left = new Node(3);
		tree.root.right = new Node(10);
		tree.root.right.left = new Node(9);
		tree.root.left.left = new Node(1);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(4);
		tree.root.left.right.right = new Node(7);
		tree.root.right.right = new Node(14);
		tree.root.right.right.left = new Node(13);
		tree.root.right.right.right = new Node(15);

		int n1 = 9, n2 = 15;
		Node t = tree.lca(tree.root, n1, n2);
		assertEquals("cheking for correct lowest ancestor", 10, t.data);
	}
	// if (node.data < n1 && node.data < n2)
	// return lca(node.right, n1, n2);

}
