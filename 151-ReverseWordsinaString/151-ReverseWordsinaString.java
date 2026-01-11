// Last updated: 1/11/2026, 2:11:24 PM
1class Solution {
2    public String reverseWords(String s) {
3        String [] st=s.split("\\s+");
4        StringBuilder sb=new StringBuilder();
5        for(int i=st.length-1;i>=0;i--){
6            sb.append(st[i]);
7            sb.append(" ");
8        }
9        return sb.toString().trim();
10        
11    }
12}