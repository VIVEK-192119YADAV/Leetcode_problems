// Last updated: 8/3/2025, 8:39:06 PM
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int merged[]=new int[m+n];
        int index=0;
        for(int i=0;i<m;i++){
            merged[index++]=nums1[i];
        }
        for(int j=0;j<n;j++){
            merged[index++]=nums2[j];

        }
        Arrays.sort(merged);
        System.arraycopy(merged,0,nums1,0,m+n);
        
    }
}