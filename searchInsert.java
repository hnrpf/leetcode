package leetcode;

public class searchInsert {

	/**
	 * @param args
	 */
	public int solution(int []A, int target)
	{
		if(A.length <= 0)
			return 0;
		int left = 0, right = A.length-1, mid = 0;  
        while(left <= right)  
        {  
            mid = left + (right-left)/2;  
            if(target == A[mid])  
                return mid;  
            else if(target < A[mid])  
                right = mid - 1;  
            else  
                left = mid + 1;  
        }     
        return left;  
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		searchInsert instance = new searchInsert();
		int A[] = {1,3};
		System.out.println(instance.solution(A, 4));
	}

}
