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

		// If the code is correct, the graph should have no cycles.
		assertFalse("Checks if graph has any cycles.", graph.hasCycle());

	}

}
