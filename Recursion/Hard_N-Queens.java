class Hard_N-Queens {
    public boolean isSafe(char [][]solution,int row,int col){
        //horizonntal
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
        for(int c=col;r>=0&&c>=0;r--,c--){
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
        //right up
        r=row;
        for(int c=col;r>=0&&c<solution.length;r--,c++){
            if(solution[r][c]=='Q'){
                return false;
            }
        }
        //right down
        r=row;
        for(int c=col;r<solution.length&&c<solution.length;r++,c++){
            if(solution[r][c]=='Q'){
                return false;
            }
        }
        return true;
    }
    public void place(char solution[][],List<List<String>> allSolutions){
        List<String> realSolution=new ArrayList<>();
        String row="";
        for(int i=0;i<solution.length;i++){
            row="";
            for(int j=0;j<solution[0].length;j++){
                if(solution[i][j]=='Q'){
                    row+='Q';
                }
                else{
                    row+='.';
                }
            }
            realSolution.add(row);
        }
        allSolutions.add(realSolution);
    }
    public void Nqueens(char solution[][],List<List<String>> allSolutions,int row){
        if(row==solution.length){
            place(solution,allSolutions);
            return;
        }
        for(int c=0;c<solution.length;c++){
            if(isSafe(solution,row,c)){
                solution[row][c]='Q';
                Nqueens(solution,allSolutions,row+1);
                solution[row][c]='.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allSolutions=new ArrayList<>();
        char[][] solution=new char[n][n];
        Nqueens(solution,allSolutions,0);
        return allSolutions;


    }
}