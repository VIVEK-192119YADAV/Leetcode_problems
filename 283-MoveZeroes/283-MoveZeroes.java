// Last updated: 8/3/2025, 8:38:23 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        ArrayList<Integer>list=new ArrayList<>();
        for(int num:nums){
            if(num!=0){
                list.add(num);

            }
        }
        Arrays.fill(nums,0);
        for(int i=0;i<list.size();i++){
            nums[i]=list.get(i);
        }
        
    }
}