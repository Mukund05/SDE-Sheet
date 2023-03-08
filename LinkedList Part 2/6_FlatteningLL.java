class GfG
{
    Node flatten(Node root){
	    // Your code here
	    ArrayList<Node> list=new ArrayList<>();
	    while(root!=null){
	        Node next=root.next;
	        list.add(root);
	        while(root.bottom!=null){
	            list.add(root.bottom);
	            root=root.bottom;
	        }
	        root=next;
	    }
	    Collections.sort(list,(a,b)->a.data-b.data);
	    
	   for(int i=1;i<list.size();i++){
	       Node node=list.get(i-1);
	       node.bottom=list.get(i);
	       node.next=null;
	   }
	   return list.get(0);
	   
	   
	
    }
}