package Concepts.Recursion.ProblemsForConcept.backtracking;

public class NKnightsProblem {
    public static void main(String[] args) {
        System.out.println("Number of ways to place knights: " + NKnights(new boolean[4][4], 0,0,4));;
    }

    public static int NKnights(boolean[][] board, int row, int col, int knights){
        if(knights == 0){
            displayArray(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        if(row == board.length){
            return count;
        }

        if(col == board[0].length){
            return NKnights(board, row+1, 0, knights);
        }

        if(notUnderAttack(board, row, col)){
            board[row][col] = true;
            count += NKnights(board, row, col+1, knights-1);
            board[row][col] = false;
        }

        count += NKnights(board, row, col+1, knights);

        return count;
    }

    private static boolean notUnderAttack(boolean[][] board, int row, int col) {
        if (isValid(board, row - 2, col - 1)) {
            if (board[row - 2][col - 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col - 2)) {
            if (board[row - 1][col - 2]) {
                return false;
            }
        }

        if (isValid(board, row - 2, col + 1)) {
            if (board[row - 2][col + 1]) {
                return false;
            }
        }

        if (isValid(board, row - 1, col + 2)) {
            if (board[row - 1][col + 2]) {
                return false;
            }
        }

        return true;
        }

    static boolean isValid(boolean[][] board, int row, int col) {
        if (row >= 0 && row < board.length && col >= 0 && col < board.length) {
            return true;
        }
        return false;
    }

    public static void displayArray(boolean[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[i][j]){
                    System.out.print("K ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
