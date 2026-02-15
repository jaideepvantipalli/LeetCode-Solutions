class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0;
        int len=Integer.MAX_VALUE;
        int sumofcurrentwind=0;
        for(int right=0;right<nums.length;right++){
            sumofcurrentwind+=nums[right];
            while(sumofcurrentwind>=target){
                len=Math.min(len,right-left+1);
                sumofcurrentwind-=nums[left++];
            }
        }
        return len==Integer.MAX_VALUE?0:len;
    }
}