package leetcode;

public class SearchMatrix {


	public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0 ;i<matrix.length; i++){
        	if(matrix[i][matrix[i].length - 1] >= target){
        		for(int j=matrix[i].length - 1; j>=0; j--){
        			if(matrix[i][j] == target)
        				return true;
        		}
        		break;
        	}
        }
		
		return false;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
