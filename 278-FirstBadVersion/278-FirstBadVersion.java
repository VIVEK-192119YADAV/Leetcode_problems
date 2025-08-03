// Last updated: 8/3/2025, 8:38:25 PM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=0;
        int right=n;
        while(left<right){
            int mid =left +(right-left)/2;
            if(isBadVersion(mid)){
                right=mid;
            }
            else{
                left=mid+1;
            }
        }
        return left;
        
    }
}