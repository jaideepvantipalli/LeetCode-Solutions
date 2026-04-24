class Solution {
    public int furthestDistanceFromOrigin(String moves) {
        int l=0,r=0,b=0;
        for(char ch:moves.toCharArray()){
            if(ch=='L') l++;
            else if(ch=='R') r++;
            else b++;
        }
        return Math.abs(l-r)+b;
    }
}