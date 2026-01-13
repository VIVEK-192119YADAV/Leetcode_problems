// Last updated: 1/13/2026, 4:53:53 PM
1class Solution {
2    public int firstUniqChar(String s) {
3        int[] freq=new int[26];
4        char[] chars=s.toCharArray();
5        for(int c:chars){
6            freq[c-'a']++;
7        }
8        for(int i=0;i<chars.length;i++){
9            if(freq[chars[i]-'a']==1){
10                return i;
11            }
12        }
13        return -1;
14    }
15}