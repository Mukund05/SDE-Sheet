public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0) return head;

        ListNode curr=head;
        int length=1;
        while(curr.next!=null){
            curr=curr.next;
            length++;
        } 
        curr.next=head;
        // System.out.println(length+" "+curr.val);
        k=length-k%length;
        
        while(k-->0) curr=curr.next;
        head=curr.next;
        curr.next=null;
        return head;
}