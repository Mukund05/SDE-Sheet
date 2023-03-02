class find_dupInArr {
    public int findduplicate(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct_idx=arr[i]-1;
            if(arr[i]!=arr[correct_idx]){
                swap(arr, correct_idx, i);
            }else{
                i++;
            }
        }
        return arr[arr.length-1];
    } 

    public void swap(int[] a,int left,int right){
        int temp=a[left];
        a[left]=a[right];
        a[right]=temp;
    }
}
