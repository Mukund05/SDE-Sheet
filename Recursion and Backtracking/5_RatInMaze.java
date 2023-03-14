class RatInMaze {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        ArrayList<String> list=new ArrayList<>();
        int[][] visited=new int[n][n];
        helper(0,0,m,list,"",visited);
        return list;
    }
    private static void helper(int i,int j,int[][] arr,ArrayList<String> list,String str,int[][] visited){
        if(i<0 || j<0 || i>=arr.length || j>=arr.length || arr[i][j]==0 || visited[i][j]==1) return;
        if(i==arr.length-1 && j==arr.length-1){
            String s=new String(str);
            list.add(str);
            return;
        }
        visited[i][j]=1;
        helper(i+1,j,arr,list,str+"D",visited);
        helper(i,j+1,arr,list,str+"R",visited);
        helper(i-1,j,arr,list,str+"U",visited);
        helper(i,j-1,arr,list,str+"L",visited);
        visited[i][j]=0;
    }
}
