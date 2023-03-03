import java.util.ArrayList;
import java.util.List;

class _MajourityEle3 {
    public List<Integer> majorityElement(int[] nums) {
        int num1=-1;
        int c1=0;
        int num2=-1;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1){
                c1++;
            }else if(nums[i]==num2){
                c2++;
            }else if(c1==0){
                num1=nums[i];
                c1=1;
            }else if(c2==0){
                num2=nums[i];
                c2=1;
            }else{
                c1--;
                c2--;
            }
        }
    
        List<Integer> list=new ArrayList<>();
        c1=0;
        c2=0;

        // System.out.println(num1+" "+num2);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==num1) c1++;
            else if(nums[i]==num2) c2++;
        }
        if(c1>nums.length/3) list.add(num1);
        if(c2>nums.length/3) list.add(num2);
        return list;

    }
}
