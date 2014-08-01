package leetcode;

import java.util.Stack;

public class EvalRPN {	

	/**
	 * @param args
	 */
	static public  int solution(String []tokens)
	{
		if(tokens.length <= 0)
			return 0;
		int result = 0;
		Stack <String> stack = new Stack<String>();
		for(int i = 0; i < tokens.length; i++){
			if(tokens[i] == "+" || tokens[i] == "-" || tokens[i] == "*" || tokens[i] == "/" ){
				int A = Integer.valueOf(stack.pop());
				int B = Integer.valueOf(stack.pop());
				if(tokens[i] == "+"){
					result = A + B;
					stack.push(Integer.toString(result));
				}
				else if(tokens[i] == "-"){
					result = B - A;
					stack.push(Integer.toString(result));
				}
				else if(tokens[i] == "*"){
					result = A * B;
					stack.push(Integer.toString(result));
				}
				else if(tokens[i] == "/"){
					if(A == 0)
						return 0;
					result = B / A;
					stack.push(Integer.toString(result));
				}
			}
			else 
				stack.push(tokens[i]);
		}
		
		
		return Integer.valueOf(stack.pop());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tokens[] = {"3","0","/","1","+"};
		System.out.println(EvalRPN.solution(tokens));
	}

}
