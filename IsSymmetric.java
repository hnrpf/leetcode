package leetcode;

public class IsSymmetric {

	/**
	 * @param args
	 */
	boolean solution(TreeNode root)
	{
		if(root == null)
			return true;
		return check(root.left, root.right);
	}
	
	boolean check(TreeNode left, TreeNode right)
	{
		if(left == null && right == null)
			return true;
		if(left == null || right == null)
			return false;
		return left.val == right.val && check(left.left, right.right) && check(left.right, right.left);
			
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
