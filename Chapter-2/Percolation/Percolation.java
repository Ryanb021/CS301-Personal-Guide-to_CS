public class Percolation {

    public static void main(String[] args) {
        
        // true = open, false = blocked
        boolean[][] grid = {
            {true, false, false},
            {true, true, false},
            {false, true, true}
        };

        // Keep track of visited cells
        boolean[][] visited = new boolean[3][3];

        // Display the grid
        System.out.println("Percolation Grid");

        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {

                if (grid[row][col]) {
                    System.out.print("0 ");
                } else {
                    System.out.println("X ");
                }
            }

            System.out.println();
        }

        // Start searching for every cell in the top row
        boolean percolates = false;

        for (int col = 0; col < grid[0].length; col++) {
            if (flow(grid, visited, 0, col)) {
                percolates = true;
                break;
            }
        }

        // Display the result
        System.out.println("Percolates: " + percolates);
    }

    // Check if water can reach the bottom
    public static boolean flow(boolean[][] grid, boolean[][] visited, int row, int col) {
    
        // Check if the position is outside the grid
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return false;
        }

        // Stop if blocked or already visited
        if (!grid[row][col] || visited[row][col]) {
            return false;
        }

        // Mark the cell as visited
        visited[row][col] = true;

        // Water reached the bottom
        if (row ==grid.length - 1) {
            return true;
        }

        // Check all four directions
        if (flow(grid, visited, row + 1, col)) {
            return true;
        }

         if (flow(grid, visited, row - 1, col)) {
            return true;
        }

         if (flow(grid, visited, row, col + 1)) {
            return true;
        }

         if (flow(grid, visited, row, col - 1)) {
            return true;
        }

        return false;
    }
}