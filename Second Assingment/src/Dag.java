import java.util.*;
class Graph{
	class Edge{
		int v,w;
		public Edge(int v, int w)
		{
			this.v=v; this.w=w;
		}
		@Override
		public String toString(){
			return "("+v+", "+w+")";
		}
	}
	List<Edge> G[];
	
	public Graph(int n)
	{
		G=new LinkedList[n];
		for(int i =0; i<G.length;i++)
			G[i]= new LinkedList<Edge>();
	}
	boolean isConnected(int u, int v)
	{
		for(Edge i : G[u])
			
	}
	void addEdge(int u, int v, int w)
	{
		G[u].add(0,new Edge(v,w));
	}
	@Override
	public String toString(){
		String result="";
		for(int i=0;i<G.length; i++)
			result+=i+"=>"+G[i]+ "\n";
		return result;
		
	}
	
}
public class Dag {
	public static void main(String[] args)
	{
		Graph g = new Graph(10);
		g.addEdge(0, 2, 10);
		g.addEdge(0, 5, 15);
		g.addEdge(2, 5, 10);
		g.addEdge(9, 3, 16);
		
	}
	public static void link()
	{
		List<Integer> l[] =new LinkedList[10];
		for(int i =0;i<10;i++)
			l[i]=new LinkedList<>();
		l[0].add(10); l[0].add(12); l[0].add(13);
		l[1].add(20); l[1].add(9);
		l[5].add(36); l[5].add(10);
		l[9].add(108);
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"=====>" +l[i]);
		}
	}
	

}
