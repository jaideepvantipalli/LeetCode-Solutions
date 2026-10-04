class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total=nums[0];
        int maxsum=nums[0],minsum=nums[0],curmax=nums[0],curmin=nums[0];

        for(int i=1;i<nums.length;i++){
            int num=nums[i];

            total+=num;
            curmax=Math.max(num,curmax+num);
            curmin=Math.min(num,curmin+num);
            maxsum=Math.max(maxsum,curmax);
            minsum=Math.min(minsum,curmin);
        }

        if(maxsum<0) return maxsum;
        return Math.max(maxsum,total-minsum);
    }
}