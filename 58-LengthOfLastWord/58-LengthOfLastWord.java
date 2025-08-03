// Last updated: 8/3/2025, 8:39:11 PM
class Solution {
    public int lengthOfLastWord(String s) {
       s = s.trim(); // Remove leading and trailing spaces
        int lastSpaceIndex = s.lastIndexOf(" ");
        return s.length() - lastSpaceIndex - 1;
    }
}