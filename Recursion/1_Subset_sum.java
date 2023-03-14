class Solution{
 ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        helper(arr,0,0,list);
        Collections.sort(list);
        return list;
    }
    private static void helper(ArrayList<Integer> nums,int i,int sum,ArrayList<Integer> list){
        if(i==nums.size()){
            list.add(sum);
            return;
        }
        helper(nums, i+1, sum, list);
        helper(nums, i+1, sum+nums.get(i), list);
    }
}