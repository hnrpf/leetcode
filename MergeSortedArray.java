package leetcode;

public class MergeSortedArray {

	/**
	 * @param args
	 */
	public void merge(int A[], int m, int B[], int n) {
		
		while(m>0 && n>0){
			if( A[m-1] > B[n-1]){
				A[m+n-1] = A[m-1];
				m--;
			}
			else{
				A[m+n-1] = B[n-1];
				n--;
			}
		}
		if(n != 0){
			while(n>0){
				A[n-1] = B[n-1];
				n--;
			}  
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
