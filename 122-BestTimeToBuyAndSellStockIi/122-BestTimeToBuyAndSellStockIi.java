// Last updated: 8/3/2025, 8:38:53 PM
class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]>prices[i-1]){
                profit+=prices[i]-prices[i-1];
            }
        } 
       
        return profit;
    }
     
}