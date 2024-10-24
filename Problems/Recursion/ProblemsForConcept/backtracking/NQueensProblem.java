package Problems.Recursion.ProblemsForConcept.backtracking;

import java.util.Arrays;

public class NQueensProblem {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        System.out.println("###############\t 4x4 chessboard \t###############");
        System.out.println("Number of ways to solve: " + placeQueens(board, 0));
        System.out.println();
        System.out.println();
        System.out.println("###############\t 5x5 chessboard \t###############");
        System.out.println("Number of ways to solve: " + placeQueens(new boolean[5][5], 0));
    }

    //Placing queens by making the value false;
    public static int placeQueens(boolean[][] board, int row){

        if(row == board.length){
            displayArray(board);
            return 1;
        }

        int count = 0;

        for(int col=0; col<board[0].length;col++){
            if (notUnderAttack(board, row, col)){
                board[row][col] = true;
                count += placeQueens(board, row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    public static boolean notUnderAttack(boolean[][] board, int row, int col){
        //Check for attack vertically above
        for(int i=row; i>=0; i--){
            if(board[i][col]){
                return false;
            }
        }

        //Check for attack in upper left diagonal
        int stepsLeft = Math.min(row,col);
        for(int i=1; i<=stepsLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        //Check for attack in upper right diagonal
        int stepsRight = Math.min(row, board.length-col-1);
        for(int i=1; i<=stepsRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    public static void displayArray(boolean[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
