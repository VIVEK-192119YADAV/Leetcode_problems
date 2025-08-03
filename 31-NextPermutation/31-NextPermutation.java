// Last updated: 8/3/2025, 8:39:26 PM
class Solution {
    public void nextPermutation(int[] nums) {
        int s=nums.length;
        int n=s-2;
        while(n>=0 && nums[n]>=nums[n+1]){
            n--;
        }
        if(n>=0){
            int a=s-1;
            while(nums[a]<=nums[n]){
                a--;
            }
            swap(nums,n,a);
        }
        reverse(nums,n+1,s-1);
    }
    private static void swap(int [] nums,int s,int a){
        int temp=nums[s];
        nums[s]=nums[a];
        nums[a]=temp;

    }
    private static void reverse(int[] nums,int st,int end){
        while(st<end){
            swap(nums,st++,end--);
        }
    }
}