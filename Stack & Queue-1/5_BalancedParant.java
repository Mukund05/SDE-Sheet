class BalancedParant {
    public static void main(String[] args) {
        Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }else{
                if(st.isEmpty()) return false;
                if(st.peek()=='(' && ch==')') st.pop();
                else if(st.peek()=='[' && ch==']') st.pop();
                else if(st.peek()=='{' && ch=='}') st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
}
