import java.util.*;
class longestConsecutiveSeq {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hm=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            hm.add(nums[i]);
        }
        int lcs=0;
        
        for(int val:hm){
            if(hm.contains(val-1)) continue;

            int offset=1;
            while(hm.contains(val+offset)) offset++;
            lcs=Math.max(lcs,offset);
        }
        return lcs;

    }
}
