class _RemoveDupinArr {
    public int removeDuplicates(int[] nums) {
        int idx=1;
        int prev=nums[0];
        int k=1;
        for(int i=1;i<nums.length;i++){
            if(prev!=nums[i]){
                k++;
                nums[idx++]=nums[i];
                prev=nums[i];
                // System.out.println(prev);
            }
        }
        return k;
    }
}
