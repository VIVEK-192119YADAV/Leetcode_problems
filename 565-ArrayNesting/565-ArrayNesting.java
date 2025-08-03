// Last updated: 8/3/2025, 8:38:03 PM
class Solution {
    public int arrayNesting(int[] nums) {
        int maxlen=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            int current=i;
            while(nums[current]!=-1){
                int next=nums[current];
                nums[current]=-1;
                current=next;
                count++;
                maxlen=Math.max(maxlen,count );

            }
        }
        return maxlen;
    }
}