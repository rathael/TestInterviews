package alex.test.interview.graph;

public class AlexEdge {

	private AlexVertex origin;
	
	private AlexVertex destination;
	
	private int cost = 0;
	
	public AlexEdge(AlexVertex origin, AlexVertex destination) {
		this.origin = origin;
		this.destination = destination;
	}

	public AlexVertex getOrigin() {
		return origin;
	}

	public void setOrigin(AlexVertex origin) {
		this.origin = origin;
	}

	public AlexVertex getDestination() {
		return destination;
	}

	public void setDestination(AlexVertex destination) {
		this.destination = destination;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
