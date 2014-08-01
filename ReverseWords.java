package leetcode;

public class ReverseWords {

	/**
	 * @param args
	 */
	public String solution(String s)
	{
		if(s.length() <= 0)
			return "";
		s = s.trim();
		StringBuffer buff = new StringBuffer();
		String temp[] = s.split(" ");
 		for(int i = 0; i < temp.length; i++){
 			temp[i] = temp[i].trim();
		}
 		for(int i = temp.length -1; i>= 0; i--)
 		{
 			if(!temp[i].equals("")){
 				buff.append(temp[i]);
 				if(i != 0)
 					buff.append(" ");
 			}
 		}
		return buff.toString();
	}
	public String ReversWord(String word)
	{
		StringBuffer buff = new StringBuffer(word);
		int low = 0;
		int high = word.length() - 1;
		while(low < high){
			char temp = buff.charAt(low);
			buff.setCharAt(low, buff.charAt(high));
			buff.setCharAt(high, temp);
			low++;
			high--;
		}
		return buff.toString();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "a";
		ReverseWords instance  = new ReverseWords();
		str = instance.solution(str);
		System.out.println(str);
	}

}
