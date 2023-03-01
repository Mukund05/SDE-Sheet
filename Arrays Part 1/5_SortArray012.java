import java.util.Arrays;

class SortArray012 {
    public static void main(String[] args) {
        int[] arr=new int[]{2,0,1}; 
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] nums){
        int zero=0;
        int two=nums.length-1;

        for(int i=0;i<nums.length && i<=two;i++){
            int ele=nums[i];
            if(ele==0){
                swap(nums, i, zero);
                zero++;
            }else if(ele==2){
                swap(nums, i, two);
                two--;
                i--;
            }
        }
    }
    public static void swap(int[] arr,int left,int right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
    }
}
