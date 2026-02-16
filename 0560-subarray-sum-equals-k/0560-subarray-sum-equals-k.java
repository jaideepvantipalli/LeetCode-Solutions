class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int psum=0;
        int res=0;
        hm.put(0,1);
        for(int i=0;i<nums.length;i++){
            psum+=nums[i];
            if(hm.containsKey(psum-k)){
                res+=hm.get(psum-k);
            }
            hm.put(psum,hm.getOrDefault(psum,0)+1);
        }
        return res;
    }
}