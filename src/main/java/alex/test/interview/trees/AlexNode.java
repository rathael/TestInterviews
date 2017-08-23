package alex.test.interview.trees;

public class AlexNode {

	private String name; 
	
	private AlexNode left;
	
	private AlexNode right;
	
	public AlexNode(String name) {
		this.name = name;
	}
	
	public AlexNode(String name, AlexNode left, AlexNode right) {
		this.name = name;
		this.left = left;
		this.right = right;
	}

	public AlexNode getLeft() {
		return left;
	}

	public void setLeft(AlexNode left) {
		this.left = left;
	}

	public AlexNode getRight() {
		return right;
	}

	public void setRight(AlexNode right) {
		this.right = right;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}

}
