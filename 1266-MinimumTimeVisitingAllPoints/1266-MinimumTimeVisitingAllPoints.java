// Last updated: 1/13/2026, 12:28:41 AM
1class Solution {
2    public int minTimeToVisitAllPoints(int[][] points) {
3        int ans = 0;
4        for(int i = 0;i<points.length-1;i++){
5            ans+=Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
6
7        }
8        return ans;
9    }
10}