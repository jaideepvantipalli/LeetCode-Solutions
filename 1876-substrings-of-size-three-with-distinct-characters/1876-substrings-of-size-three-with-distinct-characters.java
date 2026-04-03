class Solution {
    public int countGoodSubstrings(String s) {
        int res=0;
        int k=3;
        int left=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int right=0;right<s.length();right++){
            hm.put(s.charAt(right),hm.getOrDefault(s.charAt(right),0)+1);
            if(right-left+1==3){
                if(hm.size()==3) res++;
                hm.put(s.charAt(left),hm.get(s.charAt(left))-1);
                if(hm.get(s.charAt(left)) == 0)
                hm.remove(s.charAt(left));
                left++;
            }
        }
        return res;
    }
}