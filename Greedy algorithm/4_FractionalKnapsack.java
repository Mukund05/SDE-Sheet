class _FractionalKnapsack {
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr,new Sortbyroll());
        double ans=0;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i].weight>=W){
                ans+=(double)W*arr[i].value/arr[i].weight;
                break;
            }else{
                ans+=arr[i].value;
                W-=arr[i].weight;
            }
        }
        return ans;
    }
    class Sortbyroll implements Comparator<Item> {
        public int compare(Item p1, Item p2) {
        if ((double)p1.value/(double)p1.weight < (double)p2.value/(double)p2.weight) return -1;
        if ((double)p1.value/(double)p1.weight > (double)p2.value/(double)p2.weight) return 1;
        return 0;
     } 
    }
}
