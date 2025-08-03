// Last updated: 8/3/2025, 8:37:41 PM
// class Solution {
//     public int minimumDeletions(int[] nums) {
        
//       int n=nums.length;
//         int min=Integer.MAX_VALUE;
//         int max=Integer.MIN_VALUE;
//         for(int num:nums){
//             min=Math.min(min,num);
//             max=Math.max(max,num);
//         }
//         int fmin=-1,fmax=-1,lmin=-1,lmax=-1;
//         for(int i=0;i<n;i++){
//             if(nums[i]==min){
//                 if(fmin==-1){
//                     fmin=1;
//                     lmin=i;
//                 }
//                 if(nums[i]==max){
//                     if(fmax==-1){
//                         fmax=i;
//                         fmin=i;
//                     }
//                 }
//                 int removeStart=Math.min(lmin+1,lmax+1);
//                 int removelast=Math.max(n-fmin,n-fmax);
//                  int removeMiddle = n - Math.max(fmax, fmin) - Math.min(lmax, lmin) - 1;
//                   return Math.min(removeStart, Math.min(removelast, removeMiddle));
                 
           

//              }
             
      
          



//          }
         
//  }
class Solution {
    public int minimumDeletions(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int maxPos = 0;
        int minPos = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                maxPos = i;
            }
            if(nums[i] < min){
                min = nums[i];
                minPos = i;
            }
        }
        int front = Math.max(minPos, maxPos) + 1;
        int back = nums.length - Math.min(minPos, maxPos);
        int mid = Math.min(minPos + 1 + (nums.length - maxPos), maxPos + 1 + (nums.length - minPos));

        int res = Math.min(front, back);
        res = Math.min(res, mid);
        return res;
    }
}
 
    
      