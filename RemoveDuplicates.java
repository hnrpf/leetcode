package leetcode;

public class RemoveDuplicates {//Given a sorted array, remove the duplicates in place 
							//such that each element appear only once and return the new length.

	/**
	 * @param args
	 */
	public static int solution(int []A)
	{
		if(A.length <= 0)
			return 0;
		int newLength = 0;
		for(int i=1; i<A.length; i++){
			if(A[i] != A[newLength])
				A[++newLength] = A[i];
		}
		return newLength+1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1,2,2,3,4,4,5,6,6,7,7,7,8};
		System.out.println(RemoveDuplicates.solution(A));
	}

}
