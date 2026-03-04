class Solution {
    public int numSpecial(int[][] mat) {
        int m=mat.length,n=mat[0].length;
        int rows[]=new int[m];
        int cols[]=new int[n];
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(mat[row][col]==1){
                rows[row]++;
                cols[col]++;
                }
            }
        }
        int res=0;
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                if(mat[row][col]==1){
                    if(rows[row]==1 && cols[col]==1) res++;
                }
            }
        }
        return res;
    }
}