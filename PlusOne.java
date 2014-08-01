package leetcode;

public class PlusOne {

	
	public int[] plusOne(int[] digits) {
        if(digits.length <= 0)
        	return digits;
        boolean overflow = false;
        int i = digits.length-1;
        while(i >= 0  && digits[i] + 1 == 10){
        	digits[i] = 0;
        	i--;
        }
        if(i >= 0){
        	digits[i] += 1;
        	return digits;
        }
        if(i < 0){
        	int newdigits [] = new int[digits.length + 1];
        	newdigits[0] = 1;
        	for(i = 1; i<newdigits.length; i++)
        		newdigits[i] = 0;
        	return newdigits;
        }
        return digits;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {8,9,9,9};
		PlusOne instance = new PlusOne();
		A = instance.plusOne(A);
		for(int i=0; i<A.length; i++)
			System.out.println(A[i]);
	}

}
