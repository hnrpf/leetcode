package leetcode;

public class MaxSubArray {

	/**
	 * @param args
	 */
	int solution(int []A)
	{
		if(A.length <= 0)
			return 0;
		int startIndex = 0, endIndex = 0;
		int curSum = 0;
		int GreatestSum = 0x80000000;
		for(int i=0; i<A.length; i++){
			if(curSum <= 0){
				curSum = A[i];
				startIndex = i;
			}
			else{
				curSum += A[i];
				endIndex = i;
			}
			if(curSum > GreatestSum)
				GreatestSum = curSum;
		}
		System.out.println(startIndex);
		System.out.println(endIndex);
		return GreatestSum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxSubArray instance = new MaxSubArray();
		int A[] = {1,-2,3,4,5};
		System.out.println(instance.solution(A));
	}

}
