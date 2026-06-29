class Solution {
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int res=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,m,n,grid);
                    res++;
                }
            }
        }
        return res;
    }
    public static void dfs(int i,int j,int m,int n,char [][]grid){
        if(i<0 || i>=m || j<0 || j>=n) return;
        if(grid[i][j]=='1'){
            grid[i][j]='#';
            dfs(i,j-1,m,n,grid);
            dfs(i,j+1,m,n,grid);
            dfs(i-1,j,m,n,grid);
            dfs(i+1,j,m,n,grid);
        }
    }

}