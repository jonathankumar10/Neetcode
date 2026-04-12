class Solution {

    private int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 }};

    public int orangesRotting(int[][] grid) {
        int ROWS = grid.length;
        int COLS = grid[0].length;
        int[][] visited = new int[ROWS][COLS];
        Queue<int[]> q = new LinkedList<>();

        int time = 0;
        int fresh = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 1) {
                    fresh++;
                }
                if (grid[r][c] == 2) {
                    q.add(new int[]{r, c});
                }
            }
        }

        while(fresh > 0 && !q.isEmpty()){
            int size = q.size();
            for(int i =0; i < size; i++){
                int[] curr = q.remove();
                int r = curr[0];
                int c = curr[1];


                for(int[] d: directions){
                    int row = r+ d[0];
                    int col = c + d[1];
                    if(row >= 0 && col >=0 && row < ROWS && col < COLS && grid[row][col] == 1){
                        grid[row][col] = 2;
                        q.add(new int[] {row,col});
                        fresh--;

                    }
                }
            }
            time++;
        }

        if(fresh == 0){
            return time;
        }else{
            return -1;
        }
    }
}