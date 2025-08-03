// Last updated: 8/3/2025, 8:39:19 PM
class Solution {
    public int trap(int[] height) {
        int l=0;
        int r=height.length-1;
        int lM=0;
        int rM=0;
        int water=0;
        while(l<r){
            if(height[l]<height[r]){
                if(height[l]>=lM){
                    lM=height[l];
                }
                else{
                    water+=lM-height[l];
                }
                l++;
            }
            else{
                if(height[r]>=rM){
                    rM=height[r];
                }
                else{
                    water+=rM-height[r];
                }
                r--;
            }
        }
        return water;
        
    }
}