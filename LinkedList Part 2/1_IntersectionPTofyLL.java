public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> hm=new HashSet<>();
        ListNode temp=headA;
        while(temp!=null){
            hm.add(temp);
            temp=temp.next;
        }
        temp=headB;
        while( temp!=null && !hm.contains(temp)){

            temp=temp.next;
        }
        return temp;
}