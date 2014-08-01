package leetcode;

public class isSameTree {

	/**
	 * @param args
	 */
	public static boolean Solution(TreeNode p, TreeNode q)
	{
		if(p == null && q == null)
            return true;
        if(p == null || q == null)
            return false;
        else if(p.val == q.val)
        {
            boolean bLeft =  Solution(p.left, q.left);
           boolean bRight =  Solution(p.right, q.right);
            return bLeft&bRight;
        }
        else
         return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode p = new TreeNode();
		TreeNode q = new TreeNode(1);
		System.out.println(isSameTree.Solution(null, q));
		}

}
