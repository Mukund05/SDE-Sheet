class Solution {
    ListNode th=null;
    ListNode tt=null;
    public void addFirst(ListNode head){
        if(th==null){
            th=tt=head;
        }else{
            head.next=th;
            th=head;
        }
    }

    private int length(ListNode head){
        int i=0;
        for(;head!=null;i++){
            head=head.next;
        }
        return i;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || head.next==null || k==1) return head;
        ListNode ah=null,at=null;
        ListNode curr=head;
        int length=length(head);

        while(length>=k){
            int tempk=k;
            while(tempk-->0){
                ListNode forw=curr.next;
                curr.next=null;
                addFirst(curr);
                curr=forw;
            }

            if(ah==null){
                ah=th;
                at=tt;
            }else{
                at.next=th;
                at=tt;
            }
            th=tt=null;
            length=length-k;
        }
        at.next=curr;
        return ah;
    }
}