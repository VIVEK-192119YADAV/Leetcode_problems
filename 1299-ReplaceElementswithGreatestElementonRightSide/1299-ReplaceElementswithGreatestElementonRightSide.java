// Last updated: 1/2/2026, 4:35:20 PM
1class Solution {
2    public int[] replaceElements(int[] arr) {
3        
4        int max=-1;
5        for(int i=arr.length-1;i>=0;i--){
6            int temp=arr[i];
7            arr[i]=max;
8            max=Math.max(max,temp);
9        }
10        return arr;
11    }
12}