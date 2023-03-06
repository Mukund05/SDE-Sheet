import java.util.*;

class Sum {
    public List<List<Integer>> fourSum(int[] nums, long target) {
        Arrays.sort(nums);
        List<List<Integer>> list=new ArrayList<>();
        HashSet<List<Integer>> hm=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long n_target=target-nums[i]-nums[j];
                List<List<Integer>> l=twosum(nums,j+1,n_target);
                for(List<Integer> k:l){
                    List<Integer> n_list=new ArrayList<>();
                    n_list.add(nums[i]);
                    n_list.add(nums[j]);
                    n_list.add(nums[k.get(0)]);
                    n_list.add(nums[k.get(1)]);
                    hm.add(n_list);
                }
            }
        } 
        for(List<Integer> mp:hm){
            list.add(mp);
        }
        return list;
    }
    public List<List<Integer>> twosum(int[] arr,int i,long target){
        int start=i;
        int end=arr.length-1;
        List<List<Integer>> list=new ArrayList<>();
        while(start<end){

            if(arr[start]+arr[end]==target){
                List<Integer> l=new ArrayList<>();
                l.add(start);
                l.add(end);
                list.add(l);
                end--;
            }else if(arr[start]+arr[end]>target){
                end--;
            }else{
                start++;
            }
        }
        return list;
    }
}
