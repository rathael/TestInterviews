package alex.test.interview.graph;

import alex.test.interview.graph.search.BreadthFirstSearch;

public class GraphTest {

	public GraphTest() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		AlexVertex a = new AlexVertex("A");
		AlexVertex b = new AlexVertex("B");
		AlexVertex c = new AlexVertex("C");
		AlexVertex d = new AlexVertex("D");
		AlexVertex e = new AlexVertex("E");
		AlexVertex f = new AlexVertex("F");
		AlexVertex g = new AlexVertex("G");
		AlexVertex h = new AlexVertex("H");
		AlexVertex i = new AlexVertex("I");
		AlexVertex j = new AlexVertex("J");
		
		AlexGraph alexGraph = new AlexGraph();
		alexGraph.addEdge(a, b);
		alexGraph.addEdge(a, c);
		alexGraph.addEdge(b, d);
		alexGraph.addEdge(b, e);
		alexGraph.addEdge(d, h);
		alexGraph.addEdge(d, i);
		alexGraph.addEdge(c, f);
		alexGraph.addEdge(c, g);
		alexGraph.addEdge(g, j);
		
		//alexGraph.addEdge(f, j);
		alexGraph.addEdge(e, j);

		BreadthFirstSearch bfs = new BreadthFirstSearch(a, "F");
		bfs.search();
	}

}
