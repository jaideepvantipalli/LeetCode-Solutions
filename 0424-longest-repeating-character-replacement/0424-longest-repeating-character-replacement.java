class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,maxlen=0,maxfreq=0,n=s.length();

        int freq[]=new int[26];

        while(r<n){
            char ch=s.charAt(r);

            freq[ch-'A']++;

            maxfreq=Math.max(maxfreq,freq[ch-'A']);

            if((r-l+1) - maxfreq > k){
                freq[s.charAt(l)-'A']--;
                l++;
            }
            maxlen=Math.max(maxlen,(r-l+1));

            r++;

        }
        return maxlen;
    }
}