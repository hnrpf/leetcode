package leetcode;

public class IsBalanced {

	/**
	 * @param args
	 */
	public boolean solution(TreeNode root)
	{
		if(root == null)
			return true;
		int highLeft = GetHighOfTree(root.left);
		int highRight = GetHighOfTree(root.right);
		if( (highLeft-highRight)>1 || (highLeft-highRight)<-1 )
			return false;
		return solution(root.left) && solution(root.right);
	}
	public int  GetHighOfTree(TreeNode root)
	{
		if(root == null)
			return 0;
		int highLeft = GetHighOfTree(root.left) + 1;
		int highRight = GetHighOfTree(root.right) + 1;
		
		return highLeft>highRight?highLeft:highRight;
	}
//------------------------------------------------------------------------------------------------
	public boolean solution2(TreeNode root)
	{
		intValue depth = new intValue(0);
		return IsBalanceTree(root, depth);
	}
	boolean IsBalanceTree(TreeNode root, intValue depth)
	{
		if(root == null){
			depth.depth = 0;
			return true;
		}
		intValue left = new intValue(0), right = new intValue(0);
		if(IsBalanceTree(root.left,left) && IsBalanceTree(root.right, right)){
			int diff = left.depth - right.depth;
			if(diff <= 1 && diff >= -1){
				depth.depth = 1 + (left.depth>right.depth?left.depth:right.depth);
				return true;
			}
		}
		return false;
	}
	class intValue{
		int depth;
		public intValue(int n){
			depth = n;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
