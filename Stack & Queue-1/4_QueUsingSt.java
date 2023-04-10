class QueUsingSt {
    //must use only standard operations of a stack, which means only push to top, peek/pop from top, size, and is empty operations are valid.
    private static Stack<Integer> st;
    private static Stack<Integer> temp;
    public MyQueue() {
        st=new Stack<>();
        temp=new Stack<>();
    }
    
    public void push(int x) {
        while(!st.isEmpty()){
            temp.push(st.pop());
        }
        st.push(x);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
    }
    
    public int pop() {
        return st.pop();
    }
    
    public int peek() {
        return st.peek();
    }
    
    public boolean empty() {
        return st.isEmpty();
    }    
}
