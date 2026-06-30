class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color){
            return image;
        }

        int oldcolor=image[sr][sc];
        dfs(image,sr,sc,oldcolor,color);
        return image;
    }
    public static void dfs(int img[][],int sr,int sc,int oldcolor,int newcolor){
        if(sr < 0 || sr >= img.length || sc < 0 || sc>=img[0].length || img[sr][sc]!=oldcolor)
        return ;

        img[sr][sc]=newcolor;

        dfs(img,sr,sc-1,oldcolor,newcolor);
        dfs(img,sr,sc+1,oldcolor,newcolor);
        dfs(img,sr+1,sc,oldcolor,newcolor);
        dfs(img,sr-1,sc,oldcolor,newcolor);
    }

}