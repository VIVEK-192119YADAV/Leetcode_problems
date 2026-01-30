// Last updated: 1/30/2026, 9:14:04 PM
1class Solution {
2    public int mySqrt(int x) {
3        if (x==0) return 0;
4        int l = 1;
5        int r = x;
6        while (l<=r){
7            int mid = l + (r - l)/2;
8            if (mid == x/mid) return mid;
9            else if (mid < x / mid) l = mid + 1;
10            else r = mid - 1;
11        }
12        return r;
13    }
14}