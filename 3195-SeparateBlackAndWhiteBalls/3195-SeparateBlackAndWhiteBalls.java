// Last updated: 8/3/2025, 8:37:21 PM
class Solution {
    public long minimumSteps(String s) {
        long swap=0;
        int black=0;
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='0'){
            swap+=(long)black;}
            else{
            black++; 
            }
        }
        return swap;
        
    }
}