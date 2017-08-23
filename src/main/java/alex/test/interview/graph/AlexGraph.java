package alex.test.interview.graph;

import java.util.HashMap;
import java.util.Map;

public class AlexGraph {

	// private List<AlexVertex> nodes = new ArrayList<>();
	private Map<String, AlexVertex> nodes = new HashMap<>();
	
	public AlexGraph() {

	}

	public void addEdge(AlexVertex origin, AlexVertex destination) {
		if (!this.nodes.containsKey(origin.getName())) {
			this.nodes.put(origin.getName(), origin);
		} 
		
		if (!this.nodes.containsKey(destination.getName())) {
			this.nodes.put(origin.getName(), origin);
		}
		
		AlexEdge alexEdge = new AlexEdge(origin, destination);
		
		origin.getEdges().add(alexEdge);
	}
}
