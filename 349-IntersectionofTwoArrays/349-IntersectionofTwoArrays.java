// Last updated: 9/4/2025, 2:27:34 PM
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer>s=new HashSet<>();
        Set<Integer>s2=new HashSet<>();
        for(int num:nums1){
            s.add(num);
        }
        for(int num:nums2){
            if(s.contains(num)){
                s2.add(num);
            }
        }
        int [] res=new int [s2.size()];
        int i=0;
        for( int num:s2){
            res[i++]=num;

        }
        return res;

    }
}