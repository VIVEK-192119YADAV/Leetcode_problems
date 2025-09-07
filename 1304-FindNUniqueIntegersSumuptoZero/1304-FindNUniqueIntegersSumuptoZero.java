// Last updated: 9/7/2025, 11:05:39 AM
class Solution {
    public int[] sumZero(int n) {
        int res[]=new int[n];
        int s=0;
        int e= n-1;
        int temp=n/2;
        while(s<=e){
            res[s]=-temp;
            res[e]=temp;
            temp--;
            e--;
            s++;

        }
        return res;
        
    }
}