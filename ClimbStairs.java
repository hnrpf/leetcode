package leetcode;

public class ClimbStairs {

	/**
	 * @param args
	 */
	public int solution(int n){
		
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		if(n == 2)
			return 2;
		int beforeA = 1;
		int beforeB = 2;
		int temp =0;
		for(int i=3; i<=n; i++){
			temp = beforeA;
			beforeA = beforeB;
			beforeB = beforeB + temp;
		}
		
		return beforeB;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClimbStairs instance = new ClimbStairs();
		System.out.println(instance.solution(5));
	}

}
