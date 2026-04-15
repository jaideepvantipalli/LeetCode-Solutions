class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int res=words.length;
        int n=res;
        for(int i=0;i<n;i++){
            if(words[i].equals(target)){
                int dist=Math.abs(i-startIndex);
                res=Math.min(res,Math.min(dist,n-dist));
            }
        }
        return res<n?res:-1;
    }
}