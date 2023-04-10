class NextGreater2 {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums.length];
        Arrays.fill(ans,-1);
        for(int i=nums.length*2-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums[i%nums.length]) st.pop();
            if(i<nums.length ){
                if(!st.isEmpty()) ans[i]=st.peek();
            }
            st.add(nums[i%nums.length]);
        }

        return ans;
    } 
}
