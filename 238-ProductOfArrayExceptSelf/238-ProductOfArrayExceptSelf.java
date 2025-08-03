// Last updated: 8/3/2025, 8:38:33 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int [] a=new int[n];
        a[0]=1;
        for(int i=1;i<n;i++){
            a[i]=a[i-1]*nums[i-1];
        }
        int l=1;
        for(int j=n-1;j>=0;j--){
            a[j]=a[j]*l;
            l*=nums[j];
        }
         return a;
        
    }
   
}