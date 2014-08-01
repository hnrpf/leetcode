package leetcode;

public class SortColors {

	/**
	 * @param args
	 */
	public void sortColors(int[] A) {
        if(A.length <= 0)
        	return;
        int start = 0;
        int end   = A.length -1;
        int index = 0;
        while(index < A.length){
        	if(A[index] == 0){
        		if(index > start){
        			swap(A, start, index);
        			start++;
        		}
        		else
        			index++;
        	}
        	else if(A[index] == 2){
        		if(index < end)
        			swap(A, index, end--);
        		else
        			index++;
        	}
        	else
        		index++;
        }
    }
	private void swap(int A[], int a, int b)
	{
		int temp = A[a];
		A[a] = A[b];
		A[b] = temp;
	}
	static int A[] = {1,2,0,2,0,1,2};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SortColors instance = new SortColors();
		instance.sortColors(A);
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]);
		}
	}

}
