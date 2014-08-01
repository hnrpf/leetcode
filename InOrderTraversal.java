package leetcode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class InOrderTraversal {			//中序遍历二叉树，迭代方式

	/**
	 * @param args
	 */
	public List<Integer> solution(TreeNode root)
	{
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(root == null)
			return list;
		TreeNode temp = root;
		while(temp != null){
			stack.push(temp);
			temp = temp.left;
		}
		while(true){
			if(stack.isEmpty())
				break;
			TreeNode TempNode = stack.pop();
			list.add(TempNode.val);
			TempNode = TempNode.right;
			while(TempNode != null){
				stack.push(TempNode);
				TempNode = TempNode.left;
			}
		}
		
		return list;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
