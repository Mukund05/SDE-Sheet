
class Main {
    public static int[] repeatedNumber(int[] arr) {
        int idx=0;
        while(idx<arr.length){
            int correct_idx=arr[idx]-1;

            if(arr[idx]!=arr[correct_idx]){
                int temp=arr[idx];
                arr[idx]=arr[correct_idx];
                arr[correct_idx]=temp;
            }else{
                idx++;
            }
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                return new int[]{arr[i],i+1};
            }
        }

        return new int[]{};
    }
}
