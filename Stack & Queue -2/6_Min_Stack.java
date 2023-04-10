class Min_Stack {
    class MinStack {
        class Node{
            int val;
            int min;
            Node next;
            Node(int val,int min,Node next){
                this.val=val;
                this.min=min;
                this.next=next;
            }
    
        }
        Node head;
        public MinStack() {
            head=null;
        }
        
        public void push(int val) {
            if(head==null){
                head=new Node(val,val,head);
            }else{
                head=new Node(val,Math.min(head.min,val),head);
            }
        }
        
        public void pop() {
            head=head.next;
        }
        
        public int top() {
            return head.val;
        }
        
        public int getMin() {
            return head.min;
        }
    }    
}
