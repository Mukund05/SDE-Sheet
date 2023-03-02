
class MergeSortedArray {
    public void merge(int[] nums1,int m,int[] nums2,int n){
        if(n==0) return;

        for(int i=nums1.length-1;i>=0;i--){
            if(m>0 && n>0 && nums1[m-1] > nums2[n-1]){
                nums1[i]=nums1[m-1];
                m--;
            }else if(n>0){
                nums1[i]=nums2[n-1];
                n--;
            }
        }
    }
}

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]

