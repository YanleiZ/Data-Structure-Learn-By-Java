package 树和二叉树部分;

public class BinaryTree_make {
	BinaryNode<String> child_f, child_d, child_b, child_c;

	public static BinaryTree<String> make() {
		BinaryTree<String> bitree = new BinaryTree<String>();
		BinaryNode<String> child_f, child_d, child_b, child_c;
		child_d = new BinaryNode<String>("D", null, new BinaryNode<String>("G"));
		child_b = new BinaryNode<String>("B", child_d, null);
		child_f = new BinaryNode<String>("F", new BinaryNode<String>("H"), null);
		child_c = new BinaryNode<String>("C", new BinaryNode<String>("E"),
				child_f);
		bitree.root = new BinaryNode<>("A", child_b, child_c);

		return bitree;

	}

	public static void main(String[] args) {
		BinaryTree<String> bitree = make();
		bitree.preOrder();
		System.out.println(bitree.count());
		System.out.println(bitree.height());
		System.out.println(bitree.search("E").data + " "
				+ bitree.search("E").left + " " + bitree.search("E").right);
		// System.out.println(bitree.getParent());
	}
}
