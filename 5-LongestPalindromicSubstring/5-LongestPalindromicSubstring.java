// Last updated: 8/3/2025, 8:40:45 PM
class Solution {
    public String longestPalindrome(String s) {
        int max=0;
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                if(ispalindrome(s,i,j)==true){
                    if((j-i+1)>max){
                        max=j-i+1;
                        start=i;
                        end=j;
                    }
                }
            }
        }
        return s.substring(start,end+1);
    }
    public boolean ispalindrome(String s,int i,int j){
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j))
            return false;
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}