class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(k==nums.length) return nums;

        HashMap<Integer,Integer> hm=new HashMap<>();

        for(int n:nums){
            hm.put(n,hm.getOrDefault(n,0)+1);
        }

        Queue<Integer> heap=new PriorityQueue<>(
            (n1,n2)->hm.get(n1)-hm.get(n2)
        );

        for(int n:hm.keySet()){
            heap.add(n);
            if(heap.size() > k) heap.poll();
        }

        int top[]=new int[k];
        for(int i=0;i<k;i++){
            top[i]=heap.poll();
        }
        return top;
    }
}