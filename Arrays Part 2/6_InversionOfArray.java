class inversion {
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        return mergesort(arr, 0, arr.length-1);
    }

    private static int merge(long arr[],int l,int mid,int high) {
        int count=0;
        long[] a=new long[high+1];
        int idx=l;
        int left=l;
        int right=mid;

        while(left<mid && right<=high){
            if(arr[left]<=arr[right]){
                a[idx++]=arr[left++];
            }else{
                count+=mid-left;
                a[idx++]=arr[right++];
            }
        }

        while(left<mid){
            a[idx++]=arr[left++];
        }

        while(right<=high){
            a[idx++]=arr[right++];
        }

        for(int k=l;k<=high;k++){
            arr[k]=a[k];
        }


        return count;
    }
    
    private static int mergesort(long[] arr,int left,int right){
        int count=0;
        if(left<right){
            int mid=(left+right)/2;
            count+=mergesort(arr, left, mid);
            count+=mergesort(arr, mid+1, right);
            count+=merge(arr,left,mid+1,right);
        }


        return count;
    }
    
}