// Last updated: 8/6/2025, 10:02:59 PM
class Solution {
    public int maxScore(String s) {
        int score = Integer.MIN_VALUE;
        int ones=0;int zero=0;
        int n=s.length();
        for(int i=0;i<=n-2;i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
            else{
                zero++;

            }
            score=Math.max(score,(zero-ones));
        }  
        if(s.charAt(n-1)=='1'){
            ones++;
        } 
        return score + ones;   
    }
}