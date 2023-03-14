class Combinationsum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list=new ArrayList<>();
        helper(candidates,0,target,list,new ArrayList<>());
        return list;
    }
    private void helper(int[] nums,int idx,int target,List<List<Integer>> list,List<Integer> l){
        if(idx==nums.length){
            if(target==0){
                list.add(new ArrayList<>(l));
            }
            return;
        }

        if(nums[idx]<=target){
            l.add(nums[idx]);
            helper(nums,idx+1,target-nums[idx],list,l);
            l.remove(l.size()-1);
        }
        helper(nums,idx+1,target,list,l);

    }
}
