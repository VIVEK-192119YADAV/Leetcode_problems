// Last updated: 1/4/2026, 2:22:58 PM
1class Solution {
2    public int sumFourDivisors(int[] nums) {
3       int ts=0;
4       for(int n:nums){
5        int sum=0;
6        int cnt=0;
7        for(int i=1;i*i<=n;i++){
8            if(n%i==0){
9            int d1=i;
10            int d2=n/i;
11            if(d1==d2){
12                cnt++;
13                sum+=d1;
14            }
15            else{
16                cnt+=2;
17                sum +=d1+d2;
18            }
19            if(cnt>4) break;
20            
21            }
22            
23        }
24        if(cnt==4){
25            ts+=sum;
26        }
27       }
28       return ts;
29    }
30}