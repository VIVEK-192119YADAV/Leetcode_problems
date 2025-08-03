// Last updated: 8/3/2025, 8:37:50 PM
class Solution {
    public boolean checkIfPangram(String s) {
        Set <Character>set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            set.add(s.charAt(i));
        }
        return set.size()==26;
        
    }
}