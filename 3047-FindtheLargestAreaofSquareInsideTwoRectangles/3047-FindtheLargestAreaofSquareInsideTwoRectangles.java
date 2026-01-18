// Last updated: 1/18/2026, 11:26:41 PM
1class Solution {
2    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
3        long fLen = 0;
4        for(int i = 0; i < bottomLeft.length; i++){
5            long x1 = bottomLeft[i][0], x2 = topRight[i][0], y1 = bottomLeft[i][1], y2 = topRight[i][1];
6            for(int j = i + 1; j < bottomLeft.length; j++)
7            {
8                long x3 = bottomLeft[j][0], x4 = topRight[j][0], y3 = bottomLeft[j][1], y4 = topRight[j][1];
9                if(x2 > x3 && y2 > y3){
10                    long nx1 = Math.max(x1, x3), nx2 = Math.min(x2, x4), ny1 = Math.max(y1, y3), ny2 = Math.min(y2, y4);
11                    long len = Math.min(nx2- nx1, ny2 - ny1);
12                    fLen = Math.max(len, fLen);
13                }
14            }
15        }
16        return fLen*fLen;
17    }
18};