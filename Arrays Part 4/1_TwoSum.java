import java.util.HashMap;

class Main{
    public static void main(String[] args) {
        int[] a={2,7,11,15};
        int[] arr=twoSum(a,9);
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
    
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i])){
                int idx=hm.get(nums[i]);
                return new int[]{idx,i};
            }else{
                hm.put(target-nums[i],i);
            }
        }
        return new int[]{0,0};
    
    }
}