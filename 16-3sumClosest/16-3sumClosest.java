// Last updated: 8/3/2025, 8:39:52 PM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result=nums[0]+nums[1]+nums[2];
        int mindifference=Integer.MAX_VALUE;
        for(int i=0;i<=nums.length;i++){
            int l=i+1;
            int r=nums.length-1;
            int sum;
            while(l<r){
             sum =nums[i]+nums[l]+nums[r];
            if(sum==target)
                return target;
            if(sum<target)
            l++;
            else
            r--;
            int difftotarget=Math.abs(sum-target);
            if(difftotarget<mindifference){
                result=sum;
                mindifference=difftotarget;
            }
        }

       
    }
     return result;
    }
       
}