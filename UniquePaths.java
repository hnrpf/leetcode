package leetcode;

public class UniquePaths {

	
	/**�ݹ�ʵ��
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public int uniquePaths(int m, int n) {
        if(m == 0 || n == 0)
        	return 0;
        if(m == 1 || n == 1)
        	return 1;
        return uniquePaths(m-1, n)+ uniquePaths(m, n-1);
    }
	public int solution(int m, int n){
		int path[][]= new int [m][n];
		for(int i=0; i<m; i++)
			path[i][0] = 1;
		for(int i=0; i<n; i++)
			path[0][i] = 1;
		for(int i = 1; i<m; i++){
			for(int j=1; j<n; j++){
				path[i][j] = path[i-1][j] + path[i][j-1];
			}
		}
		return path[m-1][n-1];
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniquePaths instance = new UniquePaths();
		System.out.print(instance.solution(23, 12));
	}

}
