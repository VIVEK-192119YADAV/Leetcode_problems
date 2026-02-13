// Last updated: 2/14/2026, 12:09:49 AM
1class Solution {
2    public int getval(char ch){
3        switch(ch)
4        {
5            case'I':return 1;
6            case'V':return 5;
7            case'X':return 10;
8            case'L':return 50;
9            case'C':return 100;
10            case'D':return 500;
11            case'M':return 1000;
12            default:return 0;
13
14            
15        }
16    }
17    public int romanToInt(String s) {
18        int n=s.length();
19        int sum=0;
20        for(int i=0;i<n;i++){
21            char ch1=s.charAt(i);
22            if((i+1)<n && getval(ch1) < getval(s.charAt(i+1)))
23                sum=sum-getval(ch1);
24        
25            else
26                sum=sum+getval(ch1);
27            
28        }
29        return sum;
30     
31    }
32}