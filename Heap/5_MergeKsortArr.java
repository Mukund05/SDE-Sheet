class MergeKsortArr {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(ArrayList al:kArrays){
			for(int i=0;i<al.size();i++){
				pq.add((Integer)al.get(i));
			}
		}
		ArrayList<Integer> ans=new ArrayList<>();
		while(!pq.isEmpty()){
			ans.add(pq.poll());
		}
		return ans;
}
//if k sorted list then
class sortedlist {
    public ListNode mergeKLists(ListNode[] lists) {
        return mergeList(lists,0,lists.length-1);
    }

    private ListNode mergeList(ListNode[] lists,int si,int ei){
        if(si>=ei){
            return si==ei?lists[si]:null;
        }
        int mid=(si+ei)/2;
        return mergesort(mergeList(lists,si,mid),mergeList(lists,mid+1,ei));
    }
    private ListNode mergesort(ListNode head1,ListNode head2){
        if(head1==null || head2==null){
            return head1==null?head2:head1;
        }
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy,c1=head1,c2=head2;

        while(c1!=null && c2!=null){
            if(c1.val<c2.val){
                curr.next=c1;
                c1=c1.next;
            }else{
                curr.next=c2;
                c2=c2.next;
            }
            curr=curr.next;
        }
        curr.next=c1==null?c2:c1;
        return dummy.next;
    }
}
