// Last updated: 10/20/2025, 10:05:55 AM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int X=0;
        for(String c:operations){
            if(c.equals("--X")||c.equals("X--"))X--;
            else X++;
        }
        return X;
        
    }
}