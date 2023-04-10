class SlidingWindowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<Integer>();

        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        int[] ans=new int[nums.length-k+1];
        int idx=0;
        for(int i=k;i<nums.length;i++){
            ans[idx++]=nums[dq.peek()];

            while(!dq.isEmpty() && dq.peek()<=i-k) dq.removeFirst();

            while(!dq.isEmpty() && nums[i]>=nums[dq.peekLast()]){
                dq.removeLast();
            }
            dq.addLast(i);
        }
        ans[idx++]=nums[dq.peek()];
        return ans;
    }    
}
