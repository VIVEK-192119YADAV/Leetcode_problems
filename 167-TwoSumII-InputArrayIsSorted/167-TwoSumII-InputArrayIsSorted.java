// Last updated: 6/16/2026, 4:04:59 PM
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        int i=0;
4        int j=numbers.length-1;
5        while(i<j){
6            int s=numbers[i]+numbers[j];
7            if(s==target)return new int []{i+1,j+1};
8            else if(s<target){
9                i++;
10
11            }
12            else{
13                j--;
14            }
15        }
16        return new int []{}; 
17    }
18}