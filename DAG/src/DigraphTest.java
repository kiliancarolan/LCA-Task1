import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DigraphTest {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		Digraph<Integer> graph = new Digraph<Integer>();
		graph.addEdge(1, 1);
		graph.addEdge(1, 2);
		assertEquals("checking if graph is entered correctly", graph);
	

	}
	@Test
	public void testContains()
	{
		Digraph<Integer> graph = new Digraph<Integer>();
		graph.addVertex(1);
		graph.addVertex(2);
		boolean istrue = contains();
	}
	@Test
	public void testRemove(){
		
	}
	@Test
	 public void testInDegree()
	 {
		
	 }
	@Test
	public void testTopSort()
	{
		
	}
	@Test 
	public void testIsDag()
	{
		Digraph<Integer> graph = new Digraph<Integer>();
        graph.add(0, 1); graph.add(0, 2); graph.add(0, 3);
        graph.add(1, 2); graph.add(1, 3); graph.add(2, 3);
        graph.add(2, 4); graph.add(4, 5); graph.add(5, 6);
        boolean dag =true;
        boolean ans=isDag();
        assertEquals("testing to make sure method is returns that it is a dag",dag,ans);
	}

}
