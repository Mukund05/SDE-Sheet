class Combinationsum2 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(candidates);
        subsets(candidates,0,list,new ArrayList<>(),target);
        return list;
    }
    private void subsets(int[] nums,int idx,List<List<Integer>> list,List<Integer> l,int t){
        int sum=0;
        for(Integer a:l){
            sum+=a;
        }
        if(sum>t) return;
        if(sum==t){
            list.add(new ArrayList<>(l));
        }
        for(int j=idx;j<nums.length;j++){
            if(j>idx && nums[j]==nums[j-1]) continue;
            l.add(nums[j]);
            subsets(nums,j+1,list,l,t);
            l.remove(l.size()-1);
        }
    }
}
