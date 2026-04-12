
// Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), 
// return the number of islands.
// An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
//  You may assume all four edges of the grid are all surrounded by water.

// Example 1:
// Input: grid = [
//   ["1","1","1","1","0"],
//   ["1","1","0","1","0"],
//   ["1","1","0","0","0"],
//   ["0","0","0","0","0"]
// ]
// Output: 1

// Example 2:
// Input: grid = [
//   ["1","1","0","0","0"],
//   ["1","1","0","0","0"],
//   ["0","0","1","0","0"],
//   ["0","0","0","1","1"]
// ]
// Output: 3

class Solution {

    // Space complexity: O(m*n)
    // Time complexity: O(m*n)
    public int numIslands(char[][] grid) {

        // Step 1:Get rows, columns and visited arrays
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int numOfIslands = 0;
        boolean[][] visited = new boolean[ROWS][COLS];

        // Step 2: Iterate through each node and perform bfs
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    bfs(grid, i, j, visited);
                    numOfIslands++;
                }
            }
        }
        return numOfIslands;

    }

    private final int[][] directions = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

    private void bfs(char[][] grid, int rows, int cols, boolean[][] visited) {
        // Step 3: Initialize queue for BFS and set the initial node traversed to true
        LinkedList<int[]> queue = new LinkedList<>();
        queue.add(new int[] { rows, cols });
        visited[rows][cols] = true;

        while (!queue.isEmpty()) {
            int[] node = queue.poll();
            int row = node[0];
            int col = node[1];

            // Step 4: Traverse each direction by one, check for node with value 1 and not
            // visited and add to queue and set visited to true
            for (int[] dir : directions) {
                int nr = row + dir[0];
                int nc = col + dir[1];

                if (nr >= 0 && nc >= 0 && nr < grid.length && nc < grid[0].length && grid[nr][nc] == '1'
                        && !visited[nr][nc]) {
                    queue.add(new int[] { nr, nc });
                    visited[nr][nc] = true;
                }
            }
        }
    }
}