class Solution {

    private final int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    public int numIslands(char[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int islands = 0;
        boolean[][] visited = new boolean[ROWS][COLS];

        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLS; j++){
               if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(grid, i, j, visited);
                    islands++;
                }
            }
        }

        return islands;
    }

    public void bfs(char[][] grid, int rows, int cols, boolean[][] visited){

        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { rows, cols });
        visited[rows][cols] = true;

        while(!q.isEmpty()){
            int[] node = q.poll();
            int row = node[0];
            int col = node[1];

            for(int[] dir: directions){
                int nr = row + dir[0];
                int nc = col + dir[1];

                if (nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == '1'&& !visited[nr][nc]){
                    q.add(new int[]{nr,nc});
                    visited[nr][nc] = true;
                }

            }
        }

    }
}
