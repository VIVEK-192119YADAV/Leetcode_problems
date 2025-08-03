// Last updated: 8/3/2025, 8:38:50 PM
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int ans=0;
        for(int i:nums){
            if(!set.contains(i-1)){
                int current=i+1;
                while(set.contains(current)){
                    current+=1;
                }
                int lastE=current-1;
                ans=Math.max(ans,lastE-i+1);
            }
        }
        return ans;

    }
}