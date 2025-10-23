class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1){
            return 0;
        }
        int minPrice = prices[0];
        int maxProfit = 0;
        for(int i = 0 ; i < prices.length ; i ++){
            int curPrice = prices[i];
            int curProfit = curPrice - minPrice;
            if(maxProfit < curProfit) 
            maxProfit = curProfit;
            if(minPrice > curPrice)
            minPrice = curPrice;
        }
        return maxProfit;
    }
}