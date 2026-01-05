// Last updated: 1/5/2026, 11:05:14 PM
1class Solution {
2    public int heightChecker(int[] heights) {
3        int[] arr= new int [heights.length];
4        for(int i=0;i<heights.length;i++){
5            arr[i]=heights[i];
6        }
7        Arrays.sort(arr);
8        int cnt=0;
9        for(int i=0;i<heights.length;i++){
10            if(heights[i]!=arr[i]){
11                cnt++;
12
13            }
14        }
15        return cnt;
16        
17    }
18}