class _GridUniquePath {
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        return helper(0,0,m-1,n-1,dp);
    }
    public int helper(int row,int col,int m,int n,int[][] dp){
        if(row==m+1 || col==n+1) return 0;
        if(row==m && col==n) return 1;
        if(dp[row][col]!=0) return dp[row][col];
        return dp[row][col]=helper(row+1,col,m,n,dp)+helper(row,col+1,m,n,dp);
        
    }
}
