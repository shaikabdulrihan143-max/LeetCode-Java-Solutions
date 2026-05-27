class Hard_N-queens-II {
    public boolean isSafe(char[][] solution,int row,int col){
        //horizontal
        for(int c=0;c<solution.length;c++){
            if(solution[row][c]=='Q'){
                return false;
            }
        }
        //vertical
        for(int r=0;r<solution.length;r++){
            if(solution[r][col]=='Q'){
                return false;
            }
        }
        //left up
        int r=row;
        for(int c=col;c>=0&&r>=0;c--,r--){
            if(solution[r][c]=='Q'){
                return false;
            }
        }
        //right up
        r=row;
        for(int c=col;r>=0&&c<solution.length;r--,c++){
            if(solution[r][c]=='Q'){
                return false;
            }
        }
        //left down
        r=row;
        for(int c=col;r<solution.length&&c>=0;r++,c--){
            if(solution[r][c]=='Q'){
                return false;
            }
        }
        //right down
        r=row;
        for(int c=col;c<solution.length&&r<solution.length;r++,c++){
            if(solution[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
    public void place(char[][] solution,List<List<String>> allSolution){
        String row="";
        List<String> newSolution=new ArrayList<>();
        for(int r=0;r<solution.length;r++){
            row="";
            for(int c=0;c<solution[0].length;c++){
                if(solution[r][c]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
            }
            newSolution.add(row);
        }
        allSolution.add(newSolution);
    }
    public void Nqueens(char[][] solution,List<List<String>> allSolution,int row){
        if(row==solution.length){
            place(solution,allSolution);
            return;
        }
        for(int c=0;c<solution.length;c++){
            if(isSafe(solution,row,c)){
                solution[row][c]='Q';
                Nqueens(solution,allSolution,row+1);
                solution[row][c]='.';
            }
        }
    }
    public int totalNQueens(int n) {
        char[][] solution=new char[n][n];
        List<List<String>> allSolution=new ArrayList<>();
        Nqueens(solution,allSolution,0);
        return allSolution.size();
    }
}