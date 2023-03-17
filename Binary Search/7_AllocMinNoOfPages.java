class AllocMinNoOfPages {
    public int books(int[] arr, int B) {
        if(arr.length<B) return -1;
        int min=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(arr[i],min);
            sum+=arr[i];
        }
        
        int low=min;
        int high=sum;
        int res=-1;
        while(low<=high){
            int mid=(low+high)>>1;
            
            if(ispossible(arr,mid,B)){
                high=mid-1;
                res=mid;
            }else{
                low=mid+1;
            }
        }
        return res;
        
    }
    public boolean ispossible(int[] arr,int barrier,int k){
        int stcount=1;
        int page=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>barrier) return false;
            if(page+arr[i]>barrier){
                stcount+=1;
                page=arr[i];
            }else{
                page+=arr[i];
            }
        }
        
        return stcount<=k;
    }
}
