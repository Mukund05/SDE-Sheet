class JobSequencingProb {
    int[] JobScheduling(Job arr[], int n)
    {
        // Your code here
        Arrays.sort(arr,(a,b)->b.profit-a.profit);
        
        int maxdeadline=0;
        for(int i=0;i<n;i++){
            if(arr[i].deadline>maxdeadline){
                maxdeadline=arr[i].deadline;
            }
        }
        int[] timeline=new int[maxdeadline+1];
        Arrays.fill(timeline,-1);
        
        int countjob=0,jobprofit=0;
        
        for(int i=0;i<n;i++){
            for(int j=arr[i].deadline;j>0;j--){
                if(timeline[j]==-1){
                    jobprofit+=arr[i].profit;
                    timeline[j]=1;
                    countjob++;
                    break;
                }
            }
        }
        return new int[]{countjob,jobprofit};
    }
}
