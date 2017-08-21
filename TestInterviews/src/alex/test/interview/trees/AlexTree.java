package alex.test.interview.trees;

import java.util.Stack;

public class AlexTree {

	private AlexNode root;

	public AlexTree(AlexNode root) {
		this.root = root;
	}

	public void transversePreOrder() {
		System.out.print("PreOrder = ");
		transversePreOrder(this.root);
		System.out.println();
	}

	public void transverseInOrder() {
		System.out.print("InOrder = ");
		transverseInOrder(this.root);
		System.out.println();
	}

	public void transversePostOrder() {
		System.out.print("PostOrder = ");
		transversePostOrder(this.root);
		System.out.println();
	}

	public void transversePreOrderWithoutRecursion() {
		System.out.print("PreOrderWithoutRecursion = ");

		Stack<AlexNode> stack = new Stack<>();
		stack.push(this.root);

		while (!stack.isEmpty()) {
			AlexNode currentNode = stack.pop();

			System.out.print(currentNode.getName());

			// Primero adicionamos el derecho para que lo saque del stack de
			// segundas
			if (currentNode.getRight() != null) {
				stack.push(currentNode.getRight());
			}

			if (currentNode.getLeft() != null) {
				stack.push(currentNode.getLeft());
			}
		}

		System.out.println();
	}

	// TODO MorrisTraversal
	
	/**
	 * Se usa un stack
	 */
	public void transverseInOrderWithoutRecursion() {
		System.out.print("PreOrderWithoutRecursion = ");

		Stack<AlexNode> stack = new Stack<>();

		AlexNode currentNode = root;

		while (!stack.isEmpty() || currentNode != null) {
			
			if (currentNode != null) {
				stack.push(currentNode);
				currentNode = currentNode.getLeft();
			} else {
				currentNode = stack.pop();
				
				System.out.print(currentNode.getName());
				
				currentNode = currentNode.getRight();
			}
		}

		System.out.println();
	}

	private void transversePreOrder(AlexNode node) {
		if (node == null) {
			return;
		}

		System.out.print(node.getName());

		transversePreOrder(node.getLeft());
		transversePreOrder(node.getRight());
	}

	private void transverseInOrder(AlexNode node) {
		if (node == null) {
			return;
		}

		transverseInOrder(node.getLeft());
		System.out.print(node.getName());
		transverseInOrder(node.getRight());
	}

	private void transversePostOrder(AlexNode node) {
		if (node == null) {
			return;
		}

		transversePostOrder(node.getLeft());
		transversePostOrder(node.getRight());
		System.out.print(node.getName());
	}

}
