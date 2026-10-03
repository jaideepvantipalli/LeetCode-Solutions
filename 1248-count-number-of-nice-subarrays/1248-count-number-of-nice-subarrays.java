class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countsubs(nums,k)-countsubs(nums,k-1);
    }
    static int countsubs(int nums[],int k){
        int l=0,res=0;
        int n=nums.length;
        int oddcnt=0;
        for (int right=0;right<n;right++){
            if(nums[right] % 2 == 1) oddcnt++;
            
            while(oddcnt > k ) {
                if(nums[l]%2 == 1){
                    oddcnt--;
                }
                l++;
            }
            res+=right-l+1;
        }
        return res;
    }
}