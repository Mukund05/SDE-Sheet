class _MaxConse_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i=0;
        int j=0;
        int lcs=0;
        for(i=0,j=0;j<nums.length;j++){
            if(nums[j]==0){
                lcs=Math.max(lcs,j-i);
                i=j+1;
            }
        }
        lcs=Math.max(lcs,j-i);
        return lcs;
    }
}
