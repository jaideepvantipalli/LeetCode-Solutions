class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        int res=n+1;
        for(int i=0;i<n;i++){
            int x=nums[i];
            if(hm.containsKey(x)){
                res=Math.min(res,i-hm.get(x));
            }
            hm.put(reverseNum(x),i);
        }
        return res==n+1?-1:res;
    }
    private int reverseNum(int x){
        int y=0;
        while(x>0){
            y=y*10+(x%10);
            x/=10;
        }
        return y;
    }
}