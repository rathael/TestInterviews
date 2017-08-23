package alex.test.interview.graph;

import java.util.ArrayList;
import java.util.List;

public class AlexVertex {

	private String name;
	
	private List<AlexEdge> edges = new ArrayList<>();
	
	public AlexVertex() {
	}
	
	public AlexVertex(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<AlexEdge> getEdges() {
		return edges;
	}

	public void setEdges(List<AlexEdge> edges) {
		this.edges = edges;
	}

	@Override
	public String toString() {
		return name;
	}

}
