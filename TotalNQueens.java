package leetcode;

public class TotalNQueens {

	/**
	 * @param args
	 */
	public int solution(int n)
	{
		if(n <= 0)
			return 0;
		int QueenArray[] = new int[n];
		for(int i=0; i<n; i++)
			QueenArray[i] = i;
		return Permutation(QueenArray, 0);
	}
	public int  Permutation(int []A, int index)
	{
		int num = 0;
		if(index == A.length){
			if(CheckValid(A)){
//				for(int i=0; i<A.length; i++){
//					System.out.print(A[i]);
//				}
				System.out.print("\n");
				num++;
			}
				
		}
			
		else{
			for(int i=index; i<A.length; i++){
				int temp = A[index];
				A[index] = A[i];
				A[i] = temp;
				
				num += Permutation(A, index+1);
				
				temp = A[index];
				A[index] = A[i];
				A[i] = temp;
				
			}
		}
		return num;
	}
	boolean CheckValid(int A[]){
		for(int i=0; i<A.length; i++){
			for(int j = 0; j<A.length; j++){
				if(i != j){
					if( ((i-j) == (A[i] - A[j])) || ((i-j) == (A[j] - A[i])) )
						return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TotalNQueens instance = new TotalNQueens();
		System.out.println(instance.solution(1));
	}

}
