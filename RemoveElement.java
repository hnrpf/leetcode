package leetcode;

public class RemoveElement {//Given an array and a value, remove all instances of that value in place and return the new length.

							//The order of elements can be changed. It doesn't matter what you leave beyond the new length.

	/**
	 * @param args
	 */
	public int solution(int[]A, int elem)
	{
		int start = 0;
		for(int i=0; i<A.length; i++){
			if(A[i] != elem){
				A[start++] = A[i];
			}
		}
		return start;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveElement instance = new RemoveElement();
		int A[] = {1,2,3,4,5,6,2,3,2,4};
		System.out.println(instance.solution(A, 2));
	}

}
