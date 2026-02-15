class Solution {
    public int maxLength(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            long gcdval=nums[i],lcmval=nums[i],prod=nums[i];
            for(int j=i+1;j<nums.length;j++){

                prod=prod*(long)nums[j];
                if(prod > 100000000000L) break;
                gcdval=gcd(gcdval,(long)nums[j]);
                lcmval=lcm(lcmval,(long)nums[j]);
                if(prod==gcdval*lcmval){
                    ans=Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
    private static long gcd(long a,long b){
        return (b==0)?a:gcd(b,a%b);
    }
    private static long lcm(long a,long b){
        return (a*b)/gcd(a,b);
    }
}