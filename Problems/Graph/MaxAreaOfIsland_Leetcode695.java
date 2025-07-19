package Problems.Graph;

public class MaxAreaOfIsland_Leetcode695 {
    public static void main(String[] args) {

        System.out.println(maxAreaOfIsland(new int[][]{
                {0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}
        }));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0){
            return 0;
        }

        int maxArea = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++){
                if(grid[i][j] == 1){
                    int area = dfs(grid, i, j);
                    maxArea = Math.max(area, maxArea);
                }
            }
        }

        return maxArea;
    }

    public static int dfs(int[][] grid, int i, int j){
        if(j<0 || i<0 || i>=grid.length || j>=grid[i].length || grid[i][j] == 0){
            return 0;
        }

        grid[i][j] = 0;
        int area = 1;

        area += dfs(grid, i-1, j);
        area += dfs(grid, i+1, j);
        area += dfs(grid, i, j-1);
        area += dfs(grid, i, j+1);

        return area;
    }
}
