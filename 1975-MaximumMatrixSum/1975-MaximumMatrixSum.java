// Last updated: 1/5/2026, 10:48:14 PM
1class Solution {
2    public long maxMatrixSum(int[][] matrix) {
3        int m=matrix.length;
4        int n=matrix[0].length;
5        long cnt=0;
6        long smallest= Long.MAX_VALUE;
7        long sum=0;
8        for(int i=0;i<m;i++){
9            for(int j=0;j<n;j++){
10                if(matrix[i][j]<0){
11                    cnt++;
12                }
13                long val=Math.abs(matrix[i][j]);
14                smallest=Math.min(smallest,val);
15                sum+=val;
16            }
17        }
18        if(cnt%2==0)return sum;
19
20        return sum-(2*smallest);
21    }
22    
23}