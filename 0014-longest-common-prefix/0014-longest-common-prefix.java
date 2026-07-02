class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder sb=new StringBuilder();
        int i=0,j=0;
        String s1=strs[0],s2=strs[strs.length-1];
        while(i<s1.length()){
            if(s1.charAt(i) != s2.charAt(i)){
                return sb.toString();
            }
            sb.append(s1.charAt(i));
            i++;
        }
        return sb.toString();
    }
}