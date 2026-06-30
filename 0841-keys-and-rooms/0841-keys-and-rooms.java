class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int cnt=0;
        int n=rooms.size();
        boolean vis[]=new boolean[n];
        for(int i=0;i<n;i++){
            if(!vis[i]){
                cnt++;
                dfs(i,vis,rooms);
            }
        }
        return cnt==1;
    }
    public static void dfs(int i,boolean vis[],List<List<Integer>> rooms){
        vis[i]=true;
        for(int room:rooms.get(i)){
            if(!vis[room]){
                dfs(room,vis,rooms);
            }
        }
    }
}