class PalindromicPart {
    public List<List<String>> partition(String s) {
        List<List<String>> list=new ArrayList<>();
        helper(s,0,list,new ArrayList<>());
        return list;
    }

    private void helper(String str,int idx,List<List<String>> list,List<String> l){
        if(idx==str.length()){
            list.add(new ArrayList<>(l));
            return;
        }

        for(int j=idx;j<str.length();j++){
            if(ispal(str,idx,j)){
                l.add(str.substring(idx,j+1));
                helper(str,j+1,list,l);
                l.remove(l.size()-1);
            }
        }
    }

    private boolean ispal(String str,int i,int j){
        int left=i;
        int right=j;
        while(i<=j){
            if(str.charAt(i++)!=str.charAt(j--)) return false;
        }
        return true;
    }
}
