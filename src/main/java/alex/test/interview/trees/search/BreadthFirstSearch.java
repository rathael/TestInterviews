package alex.test.interview.trees.search;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import alex.test.interview.trees.AlexNode;

public class BreadthFirstSearch {

	private AlexNode initialNode;

	private String goalName;

	public BreadthFirstSearch(AlexNode initialNode, String goalName) {
		this.initialNode = initialNode;
		this.goalName = goalName;
	}

	public void search() {
		Queue<AlexNode> queue = new LinkedList<>();
		ArrayList<AlexNode> explored = new ArrayList<>();

		// Lista donde almaceno los nodos a visitar
		queue.add(initialNode);

		// Recorrer la cola
		while (!queue.isEmpty()) {
			AlexNode current = queue.remove();

			// Lista donde almaceno los nodos ya visitados
			explored.add(current);
			
			if (current.getName().equals(goalName)) {
				System.out.println("Found " + explored);
				return;
			} else {
				if (current.getLeft() != null) {
					queue.add(current.getLeft());
				}
				if (current.getRight() != null) {
					queue.add(current.getRight());
				}
			}
		}

	}
}
