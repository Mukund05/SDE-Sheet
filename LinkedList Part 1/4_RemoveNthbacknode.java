class RemoveNthbacknode {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       
        ListNode slow=head,fast=head;   
        while(n-->0){
            fast=fast.next;
        }
        if(fast==null) return slow.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }    
}
