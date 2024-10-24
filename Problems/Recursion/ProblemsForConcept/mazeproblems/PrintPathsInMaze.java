package Problems.Recursion.ProblemsForConcept.mazeproblems;

import java.util.ArrayList;
import java.util.List;

public class PrintPathsInMaze {
    public static void main(String[] args) {
        System.out.println(getPaths("",3, 3));
        System.out.println(getPathsIncludeDiagonal("", 3,3));
    }

    public static List<String> getPaths(String processed, int row, int col){
        List<String> result = new ArrayList<>();

        if(row == 1 && col == 1){
            result.add(processed);
            return result;
        }
        if(row > 1 && col > 1){
            result.addAll(getPaths(processed + "D", row-1, col));
            result.addAll(getPaths(processed+"R", row, col-1));
        }else if(col > 1){
            result.addAll(getPaths(processed + "R", row, col-1));
        }else if(row > 1){
            result.addAll(getPaths(processed+"D", row-1, col));
        }

        return result;
    }

    public static List<String> getPathsIncludeDiagonal(String processed, int row, int col){
        List<String> result = new ArrayList<>();

        if(row == 1 && col == 1){
            result.add(processed);
            return result;
        }
        if(row > 1 && col > 1){
            result.addAll(getPathsIncludeDiagonal(processed + "D", row-1, col));
            result.addAll(getPathsIncludeDiagonal(processed+"R", row, col-1));
            result.addAll(getPathsIncludeDiagonal(processed + "*", row-1, col-1));
        }else if(col > 1){
            result.addAll(getPathsIncludeDiagonal(processed + "R", row, col-1));
        }else if(row > 1){
            result.addAll(getPathsIncludeDiagonal(processed+"D", row-1, col));
        }

        return result;
    }
}
