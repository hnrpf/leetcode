package leetcode;

public class MaxDepthOfBinaryTree {

	/**
	 * @param args
	 */
	int MaxDepth(TreeNode root)
	{
		if(root == null)
			return 0;
		int leftDepth = MaxDepth(root.left);
		int rightDepth = MaxDepth(root.right);
		
		return (leftDepth > rightDepth? leftDepth:rightDepth) + 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
