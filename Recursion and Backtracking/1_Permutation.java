class Permutation {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        helper(nums,list,new ArrayList<Integer>());
        return list;
    }
    private void helper(int[] arr,List<List<Integer>> list,List<Integer> l){
        if(l.size()==arr.length){
            list.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(l.contains(arr[i])) continue;
            l.add(arr[i]);
            helper(arr,list,l);
            l.remove(l.size()-1);
        }
    }
}
