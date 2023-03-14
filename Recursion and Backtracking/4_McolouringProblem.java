class McolouringProblem {
    // Function to determine if graph can be coloured with at most M colours
    // such
    // that no two adjacent vertices of graph are coloured with same colour.
    public boolean graphColoring(boolean graph[][], int m, int n) {
        // Your code here
        int[] color=new int[n];     //color for storing color of every node in graph
        return solve(0,graph,m,n,color);    //call by passing 0 for 0th node color
    }
    
    
    private boolean solve(int node,boolean[][] graph,int m,int n,int[] color){
        if(node==n) return true;    //if node reach n means every node is colored return true
        
        //for loop the color code is from 1 to m which is applied to every node in color array 
        for(int i=1;i<=m;i++){
            if(isSafe(graph,color,node,i,n)){   //if it's safe to apply ith color to node
                color[node]=i;                  //update color of node with ith color in array
                if(solve(node+1,graph,m,n,color)) return true;  //call for next node to color
                color[node]=0;                  //remove the ith color for next iteration of for loop
            }
        }
        return false;   //if a node not fit for color from 1 to m then it's means we can't color whole node with m color return false
    }
    
    private boolean isSafe(boolean[][] graph,int[] color,int node,int col,int maxnode){
        //check from ith node to maximun node which is given as n
        for(int i=0;i<maxnode;i++){
            //check if any node is exist as true means having connection with ith node
            //then check that what's the color of ith node if its match with current node return false
            if(graph[node][i] && color[i]==col) return false;
        }
        return true;    
    }
}
