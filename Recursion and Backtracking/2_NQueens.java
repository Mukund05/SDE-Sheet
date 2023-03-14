class NQueens {
    public List<List<String>> solveNQueens(int n) {
        if(n==0) return new ArrayList<>();
        char[][] arr=new char[n][n];
        for(char[] row:arr) Arrays.fill(row,'.');

        List<List<String>> list=new ArrayList<>();
        int row=0;
        solve(arr,list,row);
        return list;
    }

    private void solve(char[][] arr,List<List<String>> list,int row){
        if(row==arr.length){
            List<String> l=convertToString(arr);
            list.add(l);
            return;
        }

        for(int col=0;col<arr.length;col++){
            if(isSafe(arr,row,col)){
                arr[row][col]='Q';
                solve(arr,list,row+1);
                arr[row][col]='.';
            }
        }
    }

    private List<String> convertToString(char[][] arr){
        List<String> l=new ArrayList<>();
        for(char[] a:arr){
            String str=new String(a);
            l.add(str);
        }
        return l;
    }


    private boolean isSafe(char[][] grid,int row,int col){
        for(int i=row-1;i>=0;i--){
            if(grid[i][col]=='Q') return false;
        }

        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(grid[i][j]=='Q') return false;
        }

        for(int i=row-1,j=col+1;i>=0 && j<grid.length;i--,j++){
            if(grid[i][j]=='Q') return false;
        }
        return true;
    }
}
