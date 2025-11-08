// Last updated: 11/8/2025, 10:12:50 AM
class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet<Character> []rows=new HashSet[9];
        HashSet<Character>[]cols=new HashSet[9];
        HashSet<Character>[]boxs=new HashSet[9];
        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxs[i]=new HashSet<>();
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char val=board[i][j];
                if(val=='.') continue;
                int boxind=(i/3)*3+(j/3);
                if(rows[i].contains(val)|| cols[j].contains(val)|| boxs[boxind].contains(val)){
                    return false;
                }
                rows[i].add(val);
                cols[j].add(val);
                boxs[boxind].add(val);

            }
        }
        return true;



    }
}