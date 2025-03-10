// Java program to perform spiral order 
// traversal of a matrix
import java.util.ArrayList;
import java.util.List;

class GfG {
    static ArrayList<Integer> spirallyTraverse(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        ArrayList<Integer> res = new ArrayList<>();
        boolean[][] vis = new boolean[m][n];

        // Change in row index for each direction
        int[] dr = { 0, 1, 0, -1 };

        // Change in column index for each direction
        int[] dc = { 1, 0, -1, 0 };

        // Initial position in the matrix
        int r = 0, c = 0;

        // Initial direction index (0 corresponds to 'right')
        int idx = 0;

        for (int i = 0; i < m * n; ++i) {

            // Add current element to result list
            res.add(mat[r][c]);

            // Mark current cell as visited
            vis[r][c] = true;

            // Calculate the next cell coordinates based on
            // current direction
            int newR = r + dr[idx];
            int newC = c + dc[idx];

            // Check if the next cell is within bounds and not
            // visited
            if (0 <= newR && newR < m && 0 <= newC && newC < n
                    && !vis[newR][newC]) {

                // Move to the next row
                r = newR;

                // Move to the next column
                c = newC;
            } else {

                // Change direction (turn clockwise)
                idx = (idx + 1) % 4;

                // Move to the next row according to new
                // direction
                r += dr[idx];

                // Move to the next column according to new
                // direction
                c += dc[idx];
            }
        }

        return res;
    }
  
    public static void main(String[] args) {
        int[][] mat = { { 1, 2, 3, 4 },
                        { 5, 6, 7, 8 },
                        { 9, 10, 11, 12 },
                        { 13, 14, 15, 16 } };
      
        ArrayList<Integer> res = spirallyTraverse(mat);

        for (int num : res) {
            System.out.print(num + " ");
        }
    }
}
