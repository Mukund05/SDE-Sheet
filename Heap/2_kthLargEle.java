class kthLargEle {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);
        
        for (int i = 0; i < k; i++) {
              minHeap.add(nums[i]);
        }
        
        for (int j = k; j < nums.length; j++) {
            
            if(minHeap.size() == k) {
                if (nums[j] > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.add(nums[j]);
                } else {
                    continue;
                }
            }
        }
        
        return minHeap.peek();
}
