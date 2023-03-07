class Add2Number {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode h1=l1;
        ListNode h2=l2;
        
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        int carry=0;

        while(h1!=null || h2!=null){
            int sum=carry;
            if(h1!=null){
                sum+=h1.val;
                h1=h1.next;
            }
            if(h2!=null){
                sum+=h2.val;
                h2=h2.next;
            }
            if(sum/10>0){
                carry=1;
                sum=sum%10;
            }else{
                carry=0;
            }
            curr.next=new ListNode(sum);
            curr=curr.next;
            

        }
        if(carry>0){
            curr.next=new ListNode(carry);
            curr=curr.next;
        }
       
        return dummy.next;
        
    }

    private ListNode reverse(ListNode head){

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
}
