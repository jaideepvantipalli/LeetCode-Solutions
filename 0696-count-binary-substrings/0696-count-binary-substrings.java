class Solution {
    public int countBinarySubstrings(String s) {
        int cnt=0,prev=0,curr=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)!=s.charAt(i)){
                cnt+=Math.min(prev,curr);
                prev=curr;
                curr=1;
            }else curr++;
        }
        return cnt+Math.min(prev,curr);
    }
}