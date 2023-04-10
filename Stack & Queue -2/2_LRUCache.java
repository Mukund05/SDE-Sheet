class LRUCache {
    class LRUCache {
        class Node{
            Node next,prev;
            int key;
            int value;
            Node(int key,int value){
                this.key=key;
                this.value=value;
            }
        }
    
        Node head=new Node(-1,-1);      //first
        Node tail=new Node(-1,-1);      //last
        HashMap<Integer,Node> hm=new HashMap<>();       //mapped all nodes
        int cap=0;
    
        public LRUCache(int capacity) {
            cap=capacity;
            head.next=tail;
            tail.prev=head;
        }
        
        public int get(int key) {
            if(hm.containsKey(key)){
                Node node=hm.get(key);
                remove(node);
                insert(node);
                return node.value;
            }else{
                return -1;
            }
        }
    
        private void remove(Node node){
            hm.remove(node.key);
            node.prev.next=node.next;
            node.next.prev=node.prev;
        }
        private void insert(Node node){
            hm.put(node.key,node);
            Node headnext=head.next;
            head.next=node;
            node.prev=head;
            headnext.prev=node;
            node.next=headnext;
        }
        
        public void put(int key, int value) {
            if(hm.containsKey(key)){
                remove(hm.get(key));
            }
            if(hm.size()==cap){
                remove(tail.prev);
            }
            insert(new Node(key,value));
        }
    }    
}
