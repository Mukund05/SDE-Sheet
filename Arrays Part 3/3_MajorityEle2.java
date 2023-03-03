
class _MajourityEle2 {
    public int majorityElement(int[] nums) {
        int max=-1;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(count==0){
                max=nums[i];
                count=1;
            }else if(max==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return max;
    }
}
