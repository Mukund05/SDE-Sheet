public static int findCelebrity(int n) {
    // Write your code here.
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<n;i++){
        st.push(i);
    }
    
    while(st.size()>=2){
        int i=st.pop();
        int j=st.pop();

        if(Runner.knows(i,j)){
            st.push(j);
        }else{
            st.push(i);
        }

    }
    int celeb=st.pop();
    
    for(int i=0;i<n;i++){
        if(i!=celeb){
            if(!Runner.knows(i,celeb) || Runner.knows(celeb,i)) return -1;
        }
    }
    return celeb;
}