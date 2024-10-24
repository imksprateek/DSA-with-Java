package Problems.Recursion.ProblemsForConcept.backtracking;

public class PrintPathMatrixInSolveMazeAllDirections {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };

        printPathMatrix(0,0,1,maze, new int[maze.length][maze[0].length]);

    }

    //Here we are printing the step number as position at each level of recursion. The consecutive numbers make the path
    public static void printPathMatrix(int row, int col, int level, boolean[][] maze, int[][] solved){
        if(row == maze.length-1 && col == maze[0].length-1){
            solved[row][col] = level;
            printArray(solved);
            return;
        }

        if(maze[row][col] == false){
            return;
        }

        solved[row][col] = level;
        maze[row][col] = false;

        if(row < maze.length-1){
            printPathMatrix(row+1, col, level+1, maze, solved);
        }
        if(col < maze[0].length-1){
            printPathMatrix(row, col+1, level+1, maze, solved);
        }
        if(row > 0){
            printPathMatrix(row-1, col, level+1, maze, solved);
        }
        if(col > 0){
            printPathMatrix(row, col-1, level+1, maze, solved);
        }

        solved[row][col] = 0;
        maze[row][col] = true;
     }

     public static void printArray(int[][] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
         System.out.println();
     }
}
