class MatrixMedian {
    public int findMedian(int[][] matrix) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int R=matrix.length;
        int C=matrix[0].length;
        for(int i=0;i<R;i++){
            min=Math.min(min, matrix[i][0]);
            max=Math.max(max,matrix[i][C-1]);
        }
               
        int low=min;
        int high=max;
        int ans=-1;
        while(low<=high){
           int mid=(low+high)>>1;
           if(possible(matrix,mid)){
               ans=mid;
               low=mid+1;
           }else{
               high=mid-1;
           }
            
        }
        
        return ans;
    }
    boolean possible(int[][] arr,int mid){
        int count=0;
        int n=arr.length;
        int m=arr[0].length;
        int val=(n*m+1)/2;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(arr[i][j]<mid) count++;
            }
        }
        return count<val;
    }
}
