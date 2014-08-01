package leetcode;

public class SortedArrayToBST {

	/**
	 * @param args
	 */
	public TreeNode solution(int[] num){
		if(num.length <= 0)
			return null;
		TreeNode root = RecursToBST(num, 0, num.length-1);
		return root;
	}
	TreeNode RecursToBST(int num[], int start, int end){
		if( start == end )
			return new TreeNode(num[start]);
		if(start > end)
			return null;
		int mid = start + (end - start)/2;
		TreeNode root = new TreeNode(num[mid]);
		root.left = RecursToBST(num, start, mid - 1);
		root.right = RecursToBST(num, mid + 1, end);
		
		
		return root;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,3,4,5,6,7,8};
		SortedArrayToBST instance = new SortedArrayToBST();
		TreeNode node = instance.solution(A);
		System.out.println(node.val);
	}

}
