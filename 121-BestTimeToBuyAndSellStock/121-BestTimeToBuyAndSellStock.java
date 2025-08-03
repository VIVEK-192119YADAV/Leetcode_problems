// Last updated: 8/3/2025, 8:38:55 PM
class Solution {
    public int maxProfit(int[] prices) {
      
        int l=prices.length;
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        if(prices==null || prices.length<=1){
            return 0;
        }
        for(int price:prices){
            if(price<minprice){
                minprice=price;
            }
            if(price-minprice>maxprofit){
                maxprofit=price-minprice;
            }
        }
        return maxprofit;

      }  
}
