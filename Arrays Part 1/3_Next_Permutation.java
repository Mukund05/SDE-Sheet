 class Main{
     public static void main(String[] args) {
        public void solution(int[] nums) {
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

 }
