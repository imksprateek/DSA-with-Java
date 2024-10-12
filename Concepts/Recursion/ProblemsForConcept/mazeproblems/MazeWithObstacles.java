package Concepts.Recursion.ProblemsForConcept.mazeproblems;

import java.util.ArrayList;
import java.util.List;

public class MazeWithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = new boolean[3][3];
        for (int i=0; i< maze.length; i++){
            for (int j=0; j<maze[0].length; j++){
                maze[i][j] = true;
            }
        }

        //Positions marked with false have an obstacle to be avoided
        maze[2][1] = false;

        System.out.println(solveMazeWithObstacles("", 0,0,maze));
    }

    public static List<String> solveMazeWithObstacles(String processed, int row, int col, boolean[][] maze){
        List<String> result = new ArrayList<>();

        if(maze[row][col] == false){
            return new ArrayList<>();
        }

        if(row == maze.length-1 && col == maze.length-1){
            result.add(processed);
            return result;
        }

        if(row < maze.length-1 && col < maze[0].length-1){
            result.addAll(solveMazeWithObstacles(processed + "R", row, col+1, maze));
            result.addAll(solveMazeWithObstacles(processed + "D", row+1, col, maze));
            result.addAll(solveMazeWithObstacles(processed + "*", row+1, col+1, maze));
        }else if(row < maze.length-1){
            result.addAll(solveMazeWithObstacles(processed + "D", row+1, col, maze));
        }else if(col < maze.length-1){
            result.addAll(solveMazeWithObstacles(processed + "R", row, col+1, maze));
        }

        return result;
    }
}
