// Last updated: 1/13/2026, 12:02:49 AM
1class Solution {
2    public int square(int n){
3         int sum=0;
4        while(n!=0){
5           
6            int digit=n%10;
7             sum+=(digit*digit);
8             n=n/10;
9        }
10        return sum;
11    }
12    public boolean isHappy(int n) {
13        Set<Integer>set=new HashSet<>();
14        while(n!=1){
15        if(set.contains(n)){
16            return false;
17        }
18        set.add(n);
19        n=square(n);
20        
21    }
22    return true;
23    }
24}