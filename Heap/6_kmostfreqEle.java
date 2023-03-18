 class kmostfreqEle {
    HashMap<Integer,Integer> hm=new HashMap<>();
		for(int i=0;i<arr.length;i++){
			hm.put(arr[i],hm.getOrDefault(arr[i], 0)+1);
		}

		PriorityQueue<Map.Entry<Integer,Integer>> pq=new PriorityQueue<>((a,b)->a.getValue()-b.getValue());
        for (Map.Entry<Integer, Integer> it : hm.entrySet()) {
            pq.add(it);
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[] a=new int[k];
        while(!pq.isEmpty()){
            a[--k]=pq.poll().getKey();
        }
        return a;
}
