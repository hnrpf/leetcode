package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParenthesis {	

	/**
	 * @param args
	 */
	static int num = 0;
	public Set<String>  set  = new HashSet<String>();
	
	public List<String> solution(int n){
		List<String> list = new ArrayList<String>();
		if(n <= 0 )
			return list;
		StringBuffer buff = new StringBuffer();
		for(int i = 0; i < n; i++){
			buff.append("(");
			buff.append(")");
		}
		Permutation(buff, 0, 2*n-1);
		list.addAll(set);
		return list;
	}
	public void Permutation(StringBuffer buff, int start, int end){
		if(start == end){
			if(check(buff)){
				set.add(buff.toString());
				
			}
		}
		else{
			for(int i=start; i<=end; i++){
				char temp = buff.charAt(start);
				buff.setCharAt(start, buff.charAt(i));
				buff.setCharAt(i, temp);
				
				Permutation(buff, start+1, end);
				
				temp = buff.charAt(start);
				buff.setCharAt(start, buff.charAt(i));
				buff.setCharAt(i, temp);
			}
		}
	}
	boolean check(StringBuffer str){
		int i = 0;
		int num = 0;
		while(i < str.length()){
			if(str.charAt(i) == '('){
				num++;
				i++;
			}
			else{
				if(num <= 0)
					return false;
				else{
					i++;
					num--;
				}
			}
		}
		return true;
	}
	
	
	 public List<String> generateParenthesis(int n) {
	        ArrayList<String> res = new ArrayList<String>();  
	        generate(res, "", 0, 0, n);  
	        return res;  
	    }  
	    public void generate(ArrayList<String> res, String tmp, int lhs, int rhs, int n)  
	    {  
	        if(lhs == n)  
	        {  
	            for(int i = 0; i < n - rhs; i++)  
	            {  
	                tmp += ")";  
	            }  
	            res.add(tmp);  
	            return ;  
	        }  
	        generate(res, tmp + "(", lhs + 1, rhs, n);  
	        if(lhs > rhs)  
	            generate(res, tmp + ")", lhs, rhs + 1, n);  
	    }  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenerateParenthesis instance = new GenerateParenthesis();
		
		System.out.println(instance.generateParenthesis(5));
	}

}
