class StockBuySell {
    public static void main(String[] args) {
        int[] arr=new int[]{7,1,5,3,6,4}; 
        int profit=stock(arr);
        System.out.println(profit);
    }

    private static int stock(int[] arr) {
        int profit=0;
        int idx=0;
        for(int i=1;i<arr.length;i++){
            int sum=arr[i]-arr[idx];
            if(sum<0){
                idx=i;
            }else{
                profit=Math.max(profit, sum);
            }
        }

        return profit;
    }
    
}

