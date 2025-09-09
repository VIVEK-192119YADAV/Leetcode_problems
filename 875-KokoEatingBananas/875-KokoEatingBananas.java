// Last updated: 9/9/2025, 5:32:01 PM
class Solution {
    
   public int minEatingSpeed(int[] piles, int h) {
   
        int l=1;
        int r=getMax(piles);
        int ans=0;
        while(l<=r){
            int mid=(l+r)/2;
            if(canFinish(piles,mid,h)){
                ans=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
             return ans;
        
   }
         boolean canFinish(int[] piles,int mid,int h){
        int hs=0;
        for(int i=0;i<piles.length;i++)
        {
            if(piles[i]<=mid)
            {

                hs+=1;
            }
            else{
                if(piles[i]%mid==0)
                {
                    hs+=piles[i]/mid;
                }
                else
                {
                    hs+=piles[i]/mid+1;
                }
            }
            if(hs>h)return false;
        }
        if(hs>h)return false;
        return true;
    }
     private int getMax(int[] piles){
        int m=Integer.MIN_VALUE;
        for(int pile:piles){
             if(m<pile)
             {
                m=pile;
             }
        }
          return m;
    }
 
}