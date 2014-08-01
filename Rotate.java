package leetcode;

public class Rotate {

	
	public void rotate(int[][] matrix) {
        
		int n = matrix.length;
		int layers = n/2;
		for(int layer = 0; layer< layers; layer++){
			for(int i = layer; i< n-layer -1; i++){
				int temp = matrix[i][layer];
				matrix[i][layer]         = matrix[n-layer-1][i];
				matrix[n-layer-1][i]     = matrix[n-i-1][n-layer-1];
				matrix[n-i-1][n-layer-1] = matrix[layer][n-i-1];
				matrix[layer][n-i-1] 	 = temp;
			}
		}
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
