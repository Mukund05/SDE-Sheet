class KthPermutationseq {
    public String getPermutation(int n, int k) {
        int[] arr=new int[n];
        for(int i=1;i<=n;i++){
            arr[i-1]=i;
        }
        for(int i=0;i<k-1;i++){
            nextPermutation(arr);
        }
        String str="";
        for(int i=0;i<arr.length;i++){
            str+=arr[i]+"";
        }
        return str;
    }
    //used nextpermutation function from array folder
    public void nextPermutation(int[] nums) {
        if(nums.length==1) return;
        int idx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx!=-1){
            int k=nums.length-1;
            while(k>0 && nums[idx]>=nums[k]) k--;
            if(k>0) swap(nums,idx,k);
        }
        reverse(nums, idx+1, nums.length-1);
    }

    private void reverse(int[] nums,int left,int right){
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }
    private void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
