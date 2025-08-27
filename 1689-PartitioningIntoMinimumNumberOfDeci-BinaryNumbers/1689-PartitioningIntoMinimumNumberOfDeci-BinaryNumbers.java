// Last updated: 8/27/2025, 6:50:39 PM
class Solution {
    public int minPartitions(String n) {
        int ans=Integer.MIN_VALUE;
        for(char num : n.toCharArray()){
             int digit = num - '0';
            ans=Math.max(ans,digit);
        }
        return ans;
    }
}