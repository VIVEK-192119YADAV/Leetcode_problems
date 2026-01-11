// Last updated: 1/11/2026, 2:27:45 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        if(s.length()==0){
4            return true;
5        }
6        int i=0;
7        int j=0;
8        while(i<s.length() && j<t.length()){
9            if(s.charAt(i)==t.charAt(j)){
10                i++;
11                j++;
12            }
13            else{
14                j++;
15            }
16           
17            }
18             if(i==s.length()){
19                return true;
20        }
21        return false;
22    }
23}