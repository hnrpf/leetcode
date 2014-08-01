package leetcode;

public class BinaryTreeLink {

	/**
	 * @param args
	 */
//	Given the following perfect binary tree,
//    1
//  /  \
// 2    3
/// \  / \
//4  5  6  7
//After calling your function, the tree should look like:
//    1 -> NULL
//  /  \
// 2 -> 3 -> NULL
/// \  / \
//4->5->6->7 -> NULL
	public void connect(TreeLinkNode root){
		if(root == null || root.left == null)
			return;
		root.left.next = root.right;
		if(root.next != null){
			root.right.next = root.next.left;
		}
		connect(root.left);
		connect(root.right);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
