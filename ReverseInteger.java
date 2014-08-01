package leetcode;

public class ReverseInteger {

	/**
	 * @param args
	 */
	int Reverse(int x)
	{
		if(x<0)
			return 0 - ReverseInt(-x);
		else
			return ReverseInt(x);
	}
	int ReverseInt(int x)
	{
		//String str = String.valueOf(x);
		StringBuffer str = new StringBuffer(String.valueOf(x));
//		char start = str.charAt(0);
//		char end = str.charAt(str.length()-1);
		int start=0,end = str.length()-1;
		while(start != end)
		{
			char temp = str.charAt(start);
			str.setCharAt(start, str.charAt(end));
			str.setCharAt(end, temp);
			if(start != end)
				start++;
			if(start != end)
				end--;
		}
		return Integer.parseInt(str.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseInteger instance = new ReverseInteger();
		System.out.println(instance.Reverse(0));
	}

}
