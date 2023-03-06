import java.util.HashMap;

class LargestSubarraywith0sum {
    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer> hm=new HashMap<>();
        int prefix_sum=0;
        int lss=0;
        for(int i=0;i<arr.length;i++){
            prefix_sum+=arr[i];
            if(hm.containsKey(prefix_sum)){
                int idx=hm.get(prefix_sum);
                int dist=i-idx;
                lss=Math.max(lss,dist);
            }else if(prefix_sum==0){
                lss=Math.max(lss,i+1);
            }else{
                hm.put(prefix_sum,i);
            }
        }
        return lss;
        
    }
}
