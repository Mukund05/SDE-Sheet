class SudokuSolver {
    public void solveSudoku(char[][] board) {
        if(board.length==0) return;
        helper(0,0,board);
    }
    private boolean helper(int row,int col,char[][] grid){
       if(row==9) return true;
       if(col==9) return helper(row+1,0,grid);
       if(grid[row][col]!='.') {
           return helper(row,col+1,grid);
       }
       for(int i=1;i<=9;i++){
           if(isSafe(grid,row,col,i)){
               char a=(char)(i+'0');
               grid[row][col]=a;
               if(helper(row,col+1,grid)) return true;
               grid[row][col]='.';
           }
       }
       return false;
        
    }

    private boolean isSafe(char[][] arr,int row,int col,int c){
        char ch=(char)(c+'0');

        for(int i=0;i<arr.length;i++){  //
            if(arr[row][i]==ch) return false;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i][col]==ch) return false;
        }
        int start_row=row-row%3;
        int start_col=col-col%3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(arr[i+start_row][j+start_col]==ch) return false;
            }
        }
        return true;

    }
}
