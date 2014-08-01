package leetcode;

public class MaxprofitII {

	
	public int maxProfit(int[] prices) {
		if(prices.length <= 1)
			return 0;
		int index = 0;
		boolean buyorsell = false; //false stand for buy, true stand for sell
		
		int maxlow = 0x7fffffff, maxhigh =0;
		int maxprofit = 0;
		while(index<prices.length)
		{
			if(!buyorsell)	//buy
			{
				if((index+1) < prices.length)
				{
					if(prices[index+1] <= prices[index]){
						index++;
						continue;
					}		
					else{
						if(prices[index] < maxlow){
							maxlow = prices[index];
							maxhigh = 0;
						}
						buyorsell = true;
						index++;
						continue;
					}
				}
			}
			else	//sell
			{
				if(index + 1 >= prices.length){
					if(prices[index] > maxhigh){
						maxhigh = prices[index];
						if( maxhigh - maxlow > maxprofit)
							maxprofit = maxhigh - maxlow;
					}
					buyorsell = false;
					index++;
				}
				else{
					if(prices[index+1] >= prices[index]){
						index++;
						continue;
					}
					else{
						if(prices[index] > maxhigh){
							maxhigh = prices[index];
							if( maxhigh - maxlow > maxprofit)
								maxprofit = maxhigh - maxlow;
						}
						buyorsell = false;
						index++;
						continue;
					}
				}
			}
			index++;
		}
		return maxprofit;
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MaxprofitII instance = new MaxprofitII();
		int a[] = {2,1,2,0,1};
		System.out.println(instance.maxProfit(a));
	}

}
