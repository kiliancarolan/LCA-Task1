import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

public class DigraphTest<V> {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testAdd() {
		Digraph<Integer> graph = new Digraph<Integer>();
		graph.addEdge(1, 1);
		graph.addEdge(1, 2);
		assertEquals("checking if graph is entered correctly","\n 1 ->[1,2]\n 2 -> []", graph);
	/*
	 * java.lang.AssertionError: checking if graph is entered correctly expected:<*/
	}

	@Test
	public void testRemove(){
		
	}
	@Test
	 public void testInDegree()
	 {
		Digraph<Integer> graph = new Digraph<Integer>();
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 5);
		graph.addEdge(5, 6);
		Map<V,Integer> ans = new HashMap<V,Integer>();
		ans.put(key, value)
		
		

		
		
		assertEquals("testing in number of edges going into a vertex",ans, graph.inDegree());
	 }
	//java.lang.AssertionError: test expected:<5> but was:<{1=0, 2=1, 3=2, 4=1, 5=1, 6=1}>
	

	@Test
	public void testTopSort()
	{
		Digraph<Integer> graph = new Digraph<Integer>();
		graph.addEdge(1, 2);
		graph.addEdge(1, 3);
		graph.addEdge(2, 3);
		graph.addEdge(2, 4);
		graph.addEdge(4, 5);
		graph.addEdge(5, 6);
		List<Integer> ans =new ArrayList<Integer>();
		ans.add(1);
		ans.add(2);
		ans.add(4);
		ans.add(5);
		ans.add(6);
		ans.add(3);
		
		
		assertEquals("checking topological sort", ans, graph.topSort() );
		
	}
	@Test 
	public void testIsDag()
	{
		Digraph<Integer> graph = new Digraph<Integer>();
        graph.addEdge(0, 1); graph.addEdge(0, 2); graph.addEdge(0, 3);
        graph.addEdge(1, 2); graph.addEdge(1, 3); graph.addEdge(2, 3);
        graph.addEdge(2, 4); graph.addEdge(4, 5); graph.addEdge(5, 6);
        graph.topSort();
        boolean ans = graph.isDag();
        assertEquals("Checking to make sure graph is Dag",true,ans);
	}
	/*
	 java.lang.AssertionError: checking topological sort expected:<[1, 2, 4, 5, 6, 3]> but was:<[0, 1, 2, 4, 5, 6, 3]>
	

	 */

}
