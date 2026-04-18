class Solution {
    public int mirrorDistance(int n) {
        int res = 0,temp=n;
        while (n > 0) {
            res = res * 10 + (n % 10);
            n /= 10;
        }
        return Math.abs(temp-res);
    }
}