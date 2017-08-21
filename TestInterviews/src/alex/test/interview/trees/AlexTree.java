package alex.test.interview.trees;

import java.util.Stack;

public class AlexTree {

	private AlexNode root;
	
	public AlexTree(AlexNode root) {
		this.root = root;
	}
	
	public void transversePreOrder(){
		System.out.print("PreOrder = ");
		transversePreOrder(this.root);
		System.out.println();
	}

	public void transverseInOrder(){
		System.out.print("InOrder = ");
		transverseInOrder(this.root);
		System.out.println();
	}
	
	public void transversePostOrder(){
		System.out.print("PostOrder = ");
		transversePostOrder(this.root);
		System.out.println();
	}
	
	public void transversePreOrderWithoutRecursion(){
		System.out.print("PreOrderWithoutRecursion = ");
		
		Stack<AlexNode> stack = new Stack<>();
		stack.push(this.root);
		
		while (!stack.isEmpty()) {
			
		}
		
		
		System.out.println();
	}

	public void transverseInOrderWithoutRecursion(){
		System.out.print("InOrderWithoutRecursion = ");
		transverseInOrder(this.root);
		System.out.println();
	}
	
	public void transversePostOrderWithoutRecursion(){
		System.out.print("PostOrderWithoutRecursion = ");
		transversePostOrder(this.root);
		System.out.println();
	}
	
	private void transversePreOrder(AlexNode node){
		if (node == null) {
			return;
		}
		
		System.out.print(node.getName());
		
		transversePreOrder(node.getLeft());
		transversePreOrder(node.getRight());
	}
	
	private void transverseInOrder(AlexNode node){
		if (node == null) {
			return;
		}
		
		transverseInOrder(node.getLeft());
		System.out.print(node.getName());
		transverseInOrder(node.getRight());
	}
	
	private void transversePostOrder(AlexNode node){
		if (node == null) {
			return;
		}
		
		transversePostOrder(node.getLeft());
		transversePostOrder(node.getRight());
		System.out.print(node.getName());
	}
	
}
