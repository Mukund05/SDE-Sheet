class StockSpan {
    class Pair{
        int num;
        int idx;
        Pair(int num,int idx){
            this.num=num;
            this.idx=idx;
        }
    }
    Stack<Pair> st;
    int day=0;
    public StockSpanner() {
        st=new Stack<>();
        st.push(new Pair(Integer.MAX_VALUE,-1));    //DUMMY node
    }
    
    public int next(int price) {
        int ans=-1;
        while(!st.isEmpty() && st.peek().num<=price){   //will maintain linearly increasing stack
            st.pop();
        }
        // if(st.isEmpty()) {
            // ans=day+1;
        // }else{
            ans=day-st.peek().idx;
        // }
        st.push(new Pair(price,day));
        day++;
        return ans;
        
    }    
}
