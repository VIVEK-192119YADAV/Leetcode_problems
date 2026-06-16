// Last updated: 6/16/2026, 2:32:49 PM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        int l=0;
4        int r=num;
5     
6        while(l<=r){
7            int mid =l+(r-l)/2;
8            long  sq=(long)mid*(long)mid;
9        if(sq==num){
10            return true;}
11       else if(sq<num){
12            l=mid +1;
13        }
14        else{
15            r= mid-1;
16        }
17
18        }
19        return false;
20        
21    }
22}