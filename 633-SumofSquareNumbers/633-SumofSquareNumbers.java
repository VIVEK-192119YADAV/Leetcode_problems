// Last updated: 6/16/2026, 2:02:55 PM
1class Solution {
2    public boolean judgeSquareSum(int c) {
3        int i=0;
4         int j = (int)Math.sqrt(c);
5        while(i<=j){
6            long sq=(long)i*i+(long)j*j;
7            if(sq==c) return true;
8            if(sq<c){
9                i++;
10            }
11            if(sq>c){
12                j--;
13
14            }
15           
16
17        
18        }
19        return false;
20    }
21}