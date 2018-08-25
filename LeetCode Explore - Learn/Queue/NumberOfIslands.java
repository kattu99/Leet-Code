/*Given a 2d grid map of '1's (land) and '0's (water), count the number of islands. 
An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. 
You may assume all four edges of the grid are all surrounded by water. */


class Solution {
    public int numIslands(char[][] grid) {
        int count = 0; 
        
        for (int i=0; i<grid.length;  i++) {
            for (int j=0; j<grid[0].length; j++) {
                count += dfs(grid,i,j);
            }
        }
        return count; 
    }
   public int dfs(char[][] grid,int i,int j)  {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] != '1') return 0;
        grid[i][j] = '0';
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
        return 1; 
   }
}