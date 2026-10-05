class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs=new HashSet<>();
        int res=0;
        for(char ch:s.toCharArray()){

            if(hs.contains(ch)){
                hs.remove(ch);
                res+=2;
            }
            else hs.add(ch);
        }

        if(!hs.isEmpty()) res++;
        return res;
    }
}