package alex.test.interview.trees;

import alex.test.interview.trees.search.BreadthFirstSearch;
import alex.test.interview.trees.transverse.Transverser;

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
		
		Transverser transverser = new Transverser(tree.getRoot());
		
		// Esperado ABDHIECFGJ
		transverser.transversePreOrder();
		transverser.transversePreOrderWithoutRecursion();
		
		// Esperado ABCDEFGHIJ
		transverser.transverseBFS();
		
		// Esperado HDIBEAFCJG
		transverser.transverseInOrder();
		transverser.transverseInOrderWithoutRecursion();
		
		// Esperado HIDEBFJGCA
		transverser.transversePostOrder();
		
		
		
		// BFS
		BreadthFirstSearch bfs = new BreadthFirstSearch(tree.getRoot(), "H");
		bfs.search();
	}

}
