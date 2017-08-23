package alex.test.interview.graph.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import alex.test.interview.graph.AlexEdge;
import alex.test.interview.graph.AlexVertex;

public class BreadthFirstSearch {

	private AlexVertex initialNode;

	private String goalName;

	public BreadthFirstSearch(AlexVertex initialNode, String goalName) {
		this.initialNode = initialNode;
		this.goalName = goalName;
	}

	public void search() {
		Queue<AlexVertex> queue = new LinkedList<>();
		ArrayList<AlexVertex> explored = new ArrayList<>();

		// Lista donde almaceno los nodos a visitar
		queue.add(initialNode);

		// Recorrer la cola
		while (!queue.isEmpty()) {
			AlexVertex current = queue.remove();

			if (!explored.contains(current)) {
				// for (adjacentes)
				for (AlexEdge child : current.getEdges()) {
					queue.add(child.getDestination());
				}

				// Lista donde almaceno los nodos ya visitados
				explored.add(current);
			}
		}

		System.out.println(explored);
	}
}
