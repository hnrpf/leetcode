package leetcode;

public class NumTree {

	/**
	 * @param args
	 */
	public int solution(int n)
	{
		int record[] = new int[n+1];
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		if(n==2)
			return 2;
		record[0] = 1;
		record[1] = 1;
		record[2] = 2;
		for(int i=3; i<=n; i++){
			int temp = 0;
			for(int j=0; j<i;j++)
				temp += record[j]*record[i-j-1];
			record[i] = temp;
		}
			
		return record[n];		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumTree instance = new NumTree();
		System.out.println(instance.solution(3));
	}

}
