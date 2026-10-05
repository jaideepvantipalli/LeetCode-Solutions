class Solution {
    public int countSubstrings(String s) {
        if(s==null|| s.length() ==0 ) return 0;

        int cnt=0;
        for(int i=0;i<s.length();i++){
            cnt+=extendpalindrome(s,i,i);
            cnt+=extendpalindrome(s,i,i+1);
        }
        return cnt;
    }
    private int extendpalindrome(String s,int left,int right){
        int cnt=0;
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
            cnt++;
            left--;
            right++;
        }
        return cnt;
    }
}