class MedianOfDataStream {
    PriorityQueue<Integer> left;
    PriorityQueue<Integer> right;
    public MedianFinder() {
        left=new PriorityQueue<>(Collections.reverseOrder());    //gives highest values
        right=new PriorityQueue<>();                              //gives lowest values
    }
    
    public void addNum(int num) {
        if(left.isEmpty() || left.peek()>=num){
            left.add(num);
        }else{
            right.add(num);
        }

        if(left.size()-right.size()==2){
            right.add(left.poll());
        }else if(right.size()-left.size()==1){
            left.add(right.poll());
        }
    }
    
    public double findMedian() {
        if(left.size()>right.size()){
            return (double)left.peek();
        }
        return (double)(left.peek()+right.peek())/2;
    }
}
