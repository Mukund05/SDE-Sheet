
class AggressiveCows {
    public static int solve(int n, int k, int[] stalls) {
        //very very important most of the binary search q use these logic same as prev q. 
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[stalls.length-1];

        int res=-1;
        while(low<=high){
            int mid=(low+high)>>1;
            
            if(ispossible(stalls,mid,k)){
               low=mid+1;
               res=mid;
            }else{
                high=mid-1;
            }
        }
        return res;
    }
    //[1,2,5,7,10]
    private static boolean ispossible(int[] arr,int mid,int k){
        int cow=1;
        int dist=arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]-dist>=mid){
                cow++;
                dist=arr[i];
            }
        }
        return cow>=k;
        
        
    }
}
