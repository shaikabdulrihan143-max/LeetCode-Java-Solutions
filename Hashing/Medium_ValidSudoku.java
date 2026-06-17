class Solution {
    public boolean isValid(char[][] board,int row,int col,char ch){
        //horizontal
        for(int c=0;c<board.length;c++){
            if(c!=col && board[row][c]==ch){
                return false;
            }
        }
        //vertical
        for(int r=0;r<board.length;r++){
            if(r!=row && board[r][col]==ch){
                return false;
            }
        }
        //grid(3*3)
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int r=sr;r<sr+3;r++){
            for(int c=sc;c<sc+3;c++){
                if((r!=row || c!=col) && board[r][c]==ch){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        for(int r=0;r<board.length;r++){
            for(int c=0;c<board.length;c++){
                if(board[r][c]!='.'){
                    char ch=board[r][c];
                    if(!isValid(board,r,c,ch)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
