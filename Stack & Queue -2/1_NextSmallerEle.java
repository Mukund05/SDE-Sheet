import java.util.ArrayList;

class NextSmallerEle {
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n){
        // Write your code here.
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[n];
        Arrays.fill(ans, -1);

        for(int i=n-1;i>=0;i--){
            if(st.isEmpty()){
                ans[i]=-1;
                // continue;
            }else{
                while(!st.isEmpty() && arr.get(i)<=st.peek()){
                    st.pop();
                }
                if(!st.isEmpty()){
                    ans[i]=st.peek();
                }
            }
            st.push(arr.get(i));
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int a:ans){
            list.add(a);
        }
        return list;
    }
}
