// Last updated: 8/3/2025, 8:38:29 PM
class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        char[]Sarray=s.toCharArray();
        char[]tArray=t.toCharArray();
        Arrays.sort(Sarray);
        Arrays.sort(tArray);
        return Arrays.equals(Sarray,tArray);
    }
}