class _CheckLLisPalindrome {
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode next=curr.next;

            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    private ListNode midnode(ListNode head){
        ListNode slow=head;
        ListNode fast=head;

        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        
        ListNode mid_node=midnode(head);
        mid_node.next=reverse(mid_node.next);
        mid_node=mid_node.next;
        
        while(mid_node!=null){
            if(head.val!=mid_node.val) return false;
            head=head.next;
            mid_node=mid_node.next;
        }
        return true;

    }
}
