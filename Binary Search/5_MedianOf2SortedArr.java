class MedianOf2SortedArr {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length){
            return findMedianSortedArrays(nums2,nums1);
        }

        int x=nums1.length;
        int y=nums2.length;

        int low=0;
        int high=x;

        while(low<=high){
            int partitionx=(low+high)/2;
            int partitiony=(x+y+1)/2-partitionx;

            int maxLeftx=partitionx==0?Integer.MIN_VALUE:nums1[partitionx-1];
            int minRightx=partitionx==x?Integer.MAX_VALUE:nums1[partitionx];

            int maxLefty=partitiony==0?Integer.MIN_VALUE:nums2[partitiony-1];
            int minRighty=partitiony==y?Integer.MAX_VALUE:nums2[partitiony];
            // System.out.println(low+" "+high+" "+partitionx+" "+partitiony+" "+maxLeftx+" "+minRightx+" "+maxLefty+" "+minRighty);
            if(maxLeftx<=minRighty && maxLefty<=minRightx){
                if((x+y)%2==0){
                    return ((double)Math.max(maxLeftx,maxLefty)+Math.min(minRightx,minRighty))/2;
                }else{
                    return (double)Math.max(maxLeftx,maxLefty);
                }
            }else if(maxLeftx>minRighty){
                high=partitionx-1;
            }else{
                low=partitionx+1;
            }
        }
        return -1;
    }
}
