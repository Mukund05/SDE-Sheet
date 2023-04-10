class LargRectInHisto {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int n=heights.length;
        int max=0;

        for(int i=0;i<=n;i++){
            int h=i==n?0:heights[i];

            while(!st.isEmpty() && h<=heights[st.peek()]){
                int currheight=heights[st.pop()];
                int prevsmaller=st.isEmpty()?-1:st.peek();
                int area=currheight*(i-prevsmaller-1);
                max=Math.max(max,area);
            }
            st.push(i);
        }
        return max;
    }    
}
