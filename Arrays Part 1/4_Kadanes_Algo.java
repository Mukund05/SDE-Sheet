class kadane {
    public static void main(String[] args) {
        int[] arr=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int n=kadanes(arr);
        System.out.println(n);
    }

    public static int kadanes(int[] nums){
        int sum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            maxsum=Math.max(maxsum, sum);
            if(sum<0){
                sum=0;
            }
        }
        return maxsum;
    }

}
