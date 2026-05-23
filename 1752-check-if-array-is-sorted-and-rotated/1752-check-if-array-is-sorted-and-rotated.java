class Solution {
    public boolean check(int[] nums) {
        int n=nums.length;
        if(n<=1) return true;
        int inversioncnt=0;
        for(int i=1;i<n;i++){
            if(nums[i]<nums[i-1]){
                inversioncnt++;
                if(inversioncnt>1) return false;
            }
        }
        if(nums[0] < nums[n-1]) inversioncnt++;
        return inversioncnt<=1;
    }
}