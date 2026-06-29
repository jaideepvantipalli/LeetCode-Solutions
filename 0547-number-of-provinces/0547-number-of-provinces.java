class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        int cnt=0;
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                cnt++;
                dfs_helper(i,vis,isConnected,n);
            }
        }
        return cnt;
    }
    public static void dfs_helper(int s,boolean vis[],int isConnected[][],int n){
        vis[s]=true;
        for(int i=0;i<n;i++){
            if(isConnected[s][i]==1 && !vis[i]){
                dfs_helper(i,vis,isConnected,n);
            }
        }
    }
}