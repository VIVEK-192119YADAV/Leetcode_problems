// Last updated: 8/3/2025, 8:39:14 PM
import java.util.Arrays;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // while we have to print the anagram for the each string so we need to use hashmap over here. 

        Map<String , List<String>> sol = new HashMap<>();
        for(String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String str = new String(c);
            if(!sol.containsKey(str)){
                // here checing the anagrams are there in list or not if not then create new list for it 
                sol.put(str , new ArrayList<>());

            }
            sol.get(str).add(s);
        }


        
        
        
return new ArrayList<>(sol.values());
    }
}