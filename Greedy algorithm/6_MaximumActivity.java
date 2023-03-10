class _MaximumActivity {
    public static int maximumActivities(List<Integer> start, List<Integer> end) {
        //Write your code here
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<start.size();i++){
            List<Integer> l=new ArrayList<>();
            l.add(start.get(i));
            l.add(end.get(i));
            list.add(l);
        }
        Collections.sort(list,(a,b)->a.get(1)-b.get(1));

        int ans=1;
        int prev=list.get(0).get(1);
        for(int i=1;i<list.size();i++){
            if(prev<=list.get(i).get(0)){
                ans++;
                prev=list.get(i).get(1);
            }
        }
        return ans;
    }
}
