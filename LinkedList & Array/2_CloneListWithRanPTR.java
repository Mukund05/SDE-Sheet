class CloneListWithRanPTR {
    public Node copyRandomList(Node head) {
        if(head==null) return head;
        HashMap<Node,Node> hm=new HashMap<>();
        Node dummy=new Node(-1);
        Node ptr=dummy;
        Node curr=head;
        while(curr!=null){
            Node n=new Node(curr.val);
            ptr.next=n;
            ptr=ptr.next;
            hm.put(curr,ptr);
            curr=curr.next;
        }

        curr=head;
        ptr=dummy.next;
        while(curr!=null){
            Node ran=hm.get(curr.random);
            ptr.random=ran;
            ptr=ptr.next;
            curr=curr.next;
        }
        return dummy.next;
    }
}
