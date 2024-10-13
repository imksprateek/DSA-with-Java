package Concepts.Recursion.ProblemsForConcept.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolveMazeAllDirections {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, false},
                {true, true, true}
        };

        System.out.println(solveMazeWithObstaclesAllDirections("", 0,0, maze));
        System.out.println(solveMazeWithObstaclesAllDirections2("", 0,0, maze));
    }

    //Since we are backtracking we revert the changes made to the array when the function call is returned to previous. Exactly like moving one step back in both time and position

    //It can be done in 2 ways, the 1st way is more efficient

    // By reverting the changes made to maze in that call when the function call is returned
    public static List<String> solveMazeWithObstaclesAllDirections(String processed, int row, int col, boolean[][] maze){
        List<String> result = new ArrayList<>();

        if(maze[row][col] == false){
            return new ArrayList<>();
        }

        if(row == maze.length-1 && col == maze[0].length-1){
            result.add(processed);
            return result;
        }

        //Mark current position as false in the copy and pass the copy to next calls. This is done because modifying the original array would cause problems in next calls if original is passed.
        maze[row][col] = false;

        if(row < maze.length-1){
            result.addAll(solveMazeWithObstaclesAllDirections(processed + "D", row+1, col, maze));
        }
        if(col < maze.length-1){
            result.addAll(solveMazeWithObstaclesAllDirections(processed + "R", row, col+1, maze));
        }
        if(row > 0){
            result.addAll(solveMazeWithObstaclesAllDirections(processed + "U", row-1, col, maze));
        }
        if(col > 0){
            result.addAll(solveMazeWithObstaclesAllDirections(processed + "L", row, col-1, maze));
        }

        maze[row][col] = true;
        return result;
    }

    // By making changes in a copy of maze inside the function and passing that to future calls
    public static List<String> solveMazeWithObstaclesAllDirections2(String processed, int row, int col, boolean[][] maze){
        List<String> result = new ArrayList<>();

        if(maze[row][col] == false){
            return new ArrayList<>();
        }

        if(row == maze.length-1 && col == maze[0].length-1){
            result.add(processed);
            return result;
        }

        //Create a copy of maze Array
        boolean[][] newMaze = new boolean[maze.length][maze[0].length];
        for(int i=0; i< maze.length; i++){
            newMaze[i] = Arrays.copyOf(maze[i], maze[0].length);
        }

        //Mark current position as false in the copy and pass the copy to next calls. This is done because modifying the original array would cause problems in next calls if original is passed.
        newMaze[row][col] = false;

        if(row < maze.length-1){
            result.addAll(solveMazeWithObstaclesAllDirections2(processed + "D", row+1, col, newMaze));
        }
        if(col < maze.length-1){
            result.addAll(solveMazeWithObstaclesAllDirections2(processed + "R", row, col+1, newMaze));
        }
        if(row > 0){
            result.addAll(solveMazeWithObstaclesAllDirections2(processed + "U", row-1, col, newMaze));
        }
        if(col > 0){
            result.addAll(solveMazeWithObstaclesAllDirections2(processed + "L", row, col-1, newMaze));
        }

        return result;
    }
}
