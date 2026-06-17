class Solution {
    public boolean isSafe(char[][] board,int row,char ch,int col){
        //horizontal
        for(int c=0;c<board.length;c++){
            if(board[row][c]==ch){
                return false;
            }
        }
        //vertical
        for(int r=0;r<board.length;r++){
            if(board[r][col]==ch){
                return false;
            }
        }
        //grid(3*3)
        int sr=(row/3)*3;
        int sc=(col/3)*3;
        for(int r=sr;r<sr+3;r++){
            for(int c=sc;c<sc+3;c++){
                if(board[r][c]==ch){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean helper(char[][] board,int row,String insert){
        if(row==board.length){
            return true;
        }
        int col=0;
        for(int c=col;c<board.length;c++){
            if(board[row][c]=='.'){
                for(int i=0;i<insert.length();i++){
                    char ch=insert.charAt(i);
                    if(isSafe(board,row,ch,c)){
                        board[row][c]=ch;
                        if(helper(board,row,insert)){
                            return true;
                        }
                        board[row][c]='.';
                    }
                }
                return false;
            }
        }
        return helper(board,row+1,insert);
    }
    public void solveSudoku(char[][] board) {
        String insert="123456789";
        helper(board,0,insert);
    }
}
