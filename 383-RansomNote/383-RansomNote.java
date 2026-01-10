// Last updated: 1/11/2026, 12:27:23 AM
1class Solution {
2    public boolean canConstruct(String ransomNote, String magazine) {
3       int [] cnt=new int[26];
4       for(char c: magazine.toCharArray()){
5        cnt[c-'a']++;
6       }
7       for(char c:ransomNote.toCharArray()){
8        if(cnt[c-'a']==0){
9            return false;
10        }
11        cnt[c-'a']--;
12       } 
13       return true;
14    }
15}