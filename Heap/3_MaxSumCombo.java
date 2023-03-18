class MaxSumCombo {
    public class Pair{
        int l;
        int m;
        public Pair(int l,int m){
            this.l=l;
            this.m=m;
        }
        public boolean equals(Object o){
            if(o==null) {
                    return false;
                }
            if(o.getClass()!=this.getClass()){
                    return false;
                } 
            
            Pair obj=(Pair)o;
            return (l==obj.l && m==obj.m);
        }
        public int hashCode(){
            return Objects.hash(l,m);
        }
    }
    
    
    public class PairSum implements Comparable<PairSum>{
        int sum;
        int l;
        int m;
        public PairSum(int sum,int l,int m){
            this.sum=sum;
            this.l=l;
            this.m=m;
        }
        public int compareTo(PairSum o){
            return Integer.compare(o.sum,sum);
        }
    }
    
    
    public int[] solve(int[] A, int[] B, int C) {
        Arrays.sort(A);
        Arrays.sort(B);
        
        PriorityQueue<PairSum> pq=new PriorityQueue<>();
        HashSet<Pair> hm=new HashSet<>();
        
        int l=A.length-1;
        int m=B.length-1;
        
        hm.add(new Pair(l,m));
        pq.add(new PairSum(A[l]+B[m],l,m));
        int[] ans=new int[C];
        
        for(int i=0;i<C;i++){
            PairSum max=pq.poll();
            l=max.l-1;
            m=max.m;
            
            ans[i]=max.sum;
            
            if(l>=0 && m>=0 && !hm.contains(new Pair(l,m))){
                hm.add(new Pair(l,m));
                pq.add(new PairSum(A[l]+B[m],l,m));
            }
            l=max.l;
            m=max.m-1;
            if(l>=0 && m>=0 && !hm.contains(new Pair(l,m))){
                hm.add(new Pair(l,m));
                pq.add(new PairSum(A[l]+B[m],l,m));
            }
            
        }
        return ans;
        
    }
}
