class RottenOranges {
    class Pair{
        int i;
        int j;
        Pair(int i,int j){
            this.i=i;
            this.j=j;
        }

    }
    public int orangesRotting(int[][] grid) {
        Deque<Pair> dq=new ArrayDeque<>();
        int fresh=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==2){
                    dq.addLast(new Pair(i,j));
                }else if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        if(fresh==0 && dq.size()==0) return 0;

        int ans=-1;
        int[][] dirs=new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
        while(!dq.isEmpty()){
            int size=dq.size();
            for(int i=0;i<size;i++){
                Pair p=dq.removeFirst();     //index of rotten oranges

                for(int[] x:dirs){
                    int new_i=p.i+x[0];
                    int new_j=p.j+x[1];
                    if(issafe(grid,new_i,new_j)){
                        dq.addLast(new Pair(new_i,new_j));
                        grid[new_i][new_j]=2;
                    }
                }
                
            }
            ans++;
        }

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j]==1){
                    return -1;
                }
            }
        }
        return ans;


    }
    public boolean issafe(int[][] grid,int i,int j){
        if(i>=0 && j>=0 && i<grid.length && j<grid[0].length && grid[i][j]==1){
            return true;
        }
        return false;
    }    
}
