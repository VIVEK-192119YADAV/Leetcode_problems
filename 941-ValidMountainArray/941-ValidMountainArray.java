// Last updated: 1/4/2026, 12:49:22 PM
1class Solution {
2    public boolean validMountainArray(int[] arr) {
3        
4        int i=0;
5        int n=arr.length;
6        while(i+1<n && arr[i]<arr[i+1]){
7            i++;
8             }
9            if(i==0 || i==n-1){
10                return false;
11            }
12            while(i+1<n && arr[i]>arr[i+1]){
13                i++;
14            }
15            return i==n-1;
16    }
17}