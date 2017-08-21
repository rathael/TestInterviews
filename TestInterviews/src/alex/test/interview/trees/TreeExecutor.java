package alex.test.interview.trees;

public class TreeExecutor {

	public TreeExecutor() {
	}

	public static void main(String[] args) {
		// http://javarevisited.blogspot.com.es/2016/07/binary-tree-preorder-traversal-in-java-using-recursion-iteration-example.html
		
		AlexNode b = new AlexNode("B");
		AlexNode c = new AlexNode("C");
		AlexNode d = new AlexNode("D");
		AlexNode e = new AlexNode("E");
		AlexNode f = new AlexNode("F");
		AlexNode g = new AlexNode("G");
		AlexNode h = new AlexNode("H");
		AlexNode i = new AlexNode("I");
		AlexNode j = new AlexNode("J");
		
		AlexNode root = new AlexNode("A");
		
		root.setLeft(b);
		root.setRight(c);
		b.setLeft(d);
		b.setRight(e);
		d.setLeft(h);
		d.setRight(i);
		c.setLeft(f);
		c.setRight(g);
		g.setLeft(j);
		
		AlexTree tree = new AlexTree(root);
		
		// Esperado A B D H I E C F G J
		tree.transversePreOrder();
		
		// Esperado HDIBEAFCJG
		tree.transverseInOrder();
		
		// Esperado HIDEBFJGCA
		tree.transversePostOrder();
	}

}
