class Solution {
    public int minElement(int[] nums) {
        int ans = Integer.MAX_VALUE;
        for (int num : nums) {
            int k = num, c = 0;
            while (k > 0) {
                c += k % 10;
                k /= 10;
            }
            ans = Math.min(ans, c);
        }
        return ans;
    }
}