package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class preorderTraversal {	//先序遍历二叉树，迭代方式

	/**
	 * @param args
	 */
public List<Integer> solution(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		if(root == null)
			return list;
		stack.push(root);
		while(true)
		{
			if(stack.isEmpty())
				break;
			TreeNode temp = stack.pop();
			list.add(temp.val);
			if(temp.right != null)
				stack.push(temp.right);
			if(temp.left != null)
				stack.push(temp.left);
		}
		
		return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
