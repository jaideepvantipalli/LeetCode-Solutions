class Solution {
    public int[][] minAbsDiff(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int res[][]=new int[m-k+1][n-k+1];
        for(int i=0;i+k<=m;i++){
            for(int j=0;j+k<=n;j++){
                List<Integer> ll=new ArrayList<>();
                for(int a=i;a<i+k;a++){
                    for(int b=j;b<j+k;b++){
                        ll.add(grid[a][b]);
                    }
                }
                int kmin=Integer.MAX_VALUE;
                Collections.sort(ll);
                for(int t=1;t<ll.size();t++){
                    if(ll.get(t).equals(ll.get(t-1)))
                    continue;
                    kmin=Math.min(kmin,ll.get(t)-ll.get(t-1));
                }
                if(kmin!=Integer.MAX_VALUE) res[i][j]=kmin;
            }
        }
        return res;
    }
}