// Last updated: 8/3/2025, 8:38:07 PM
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int maxLen=0;
        for(int i=0;i<nums.length;i++){
            sum+=(nums[i]==0) ? -1:1;
            if(map.containsKey(sum)){
                int prev=map.get(sum);
                maxLen=Math.max(maxLen,i-prev);
            }
            else{
                map.put(sum,i);
            }
        }
        return maxLen;
        
    }
}