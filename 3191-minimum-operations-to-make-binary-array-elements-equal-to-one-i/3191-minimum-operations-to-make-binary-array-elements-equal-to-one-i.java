class Solution {
    public int minOperations(int[] nums) {
        int cnt=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i-2]==0){
            cnt++;
            nums[i-2]=nums[i-2]^1;
            nums[i-1]=nums[i-1]^1;
            nums[i]=nums[i]^1;
            }
        }
        int sum=0;
        for(int i:nums) sum+=i;
        if(sum==nums.length) return cnt;
        return -1;
    }
}