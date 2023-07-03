package Arrays;

public class BestTimetobuystock {

	class Solution {
	    public int maxProfit(int[] prices) {
	        

	        int b=Integer.MAX_VALUE,s=0,pro=0;

	        for(int i=0;i<prices.length;i++){
	              if(prices[i]<b){
	                  b=prices[i];
	              }
	              pro=Math.max(prices[i]-b,pro);
	        }

	      return pro;
	    }
	}
	
	public static void main(String[] args) {
		//https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
	}

}
