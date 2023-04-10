class StackusingSingleQ {
    class MyStack {
        ArrayDeque<Integer> dq;
        public MyStack() {
            dq=new ArrayDeque<>();
        }
        
        public void push(int x) {
            dq.add(x);
        }
        
        public int pop() {
            if(dq.isEmpty()) return -1;
            return dq.removeLast();
        }
        
        public int top() {
            if(dq.isEmpty()) return -1;
            return dq.getLast();
        }
        
        public boolean empty() {
            return dq.isEmpty();
        }
    }    
}
