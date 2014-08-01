package leetcode;

import java.util.Currency;

public class MaxProfit {

	/**
	 * @param args
	 */
	public int solution(int a[])
	{
		if(a.length <= 1)
			return 0;
		int index = 0;
		boolean buyorsell = false; //false stand for buy, true stand for sell
		int profit = 0;
		int buyprice = 0;
		while(index<a.length)
		{
			if(!buyorsell)	//buy
			{
				if((index+1) < a.length)
				{
					if(a[index+1] <= a[index]){
						index++;
						continue;
					}		
					else{
						buyprice = a[index];
						buyorsell = true;
						index++;
						continue;
					}
				}
			}
			else	//sell
			{
				if(index + 1 >= a.length){
					profit += a[index] - buyprice;
					buyorsell = false;
					index++;
				}
				else{
					if(a[index+1] >= a[index]){
						index++;
						continue;
					}
					else{
						profit += a[index] - buyprice; 
						buyorsell = false;
						index++;
						continue;
					}
				}
			}
			index++;
		}
		return profit;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxProfit instance = new MaxProfit();
		int a[] = {1,2,3,1,2,3,3,4,3,1};
		System.out.println(instance.solution(a));
	}

}
