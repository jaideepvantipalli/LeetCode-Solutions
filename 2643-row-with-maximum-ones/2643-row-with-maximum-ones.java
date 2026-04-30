class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int rowidx=0,maxcnt=0;
        for(int i=0;i<mat.length;i++){
            int cnt=0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1) cnt++;
            }
            if(cnt > maxcnt){
                maxcnt=cnt;
                rowidx=i;
            }
        }
        return new int[]{rowidx,maxcnt};
    }
}