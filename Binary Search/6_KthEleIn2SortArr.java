class KthEleIn2SortArr {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        if (n>m)    return kthElement(arr2,arr1,m,n,k);
        int left=Math.max(0,k-m),right=Math.min (k,n);
        while (left<=right){
            int c1=(left+right)>>1;
            int c2=k-c1;
            int l1= c1>0 ? arr1[c1-1] : Integer.MIN_VALUE;
            int l2= c2>0 ? arr2[c2-1] : Integer.MIN_VALUE;
            int r1= c1>=n ? Integer.MAX_VALUE: arr1[c1];
            int r2= c2>=m ? Integer.MAX_VALUE : arr2[c2];
            if (l1>r2)  right=c1-1;
            else if (l2>r1) left=c1+1;
            else return Math.max(l1,l2);
        }
        return 1;

    }
}
