class Subset2 {
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            List<List<Integer>> list=new ArrayList<>();
            Arrays.sort(nums);
            subsets(nums,0,list,new ArrayList<>());
            return list;
        }
    
        private void subsets(int[] nums,int idx,List<List<Integer>> list,List<Integer> l){
            list.add(new ArrayList<>(l));
            for(int j=idx;j<nums.length;j++){
                if(j>idx && nums[j]==nums[j-1]) continue;
                l.add(nums[j]);
                subsets(nums,j+1,list,l);
                l.remove(l.size()-1);
            }
        }
    }
}
