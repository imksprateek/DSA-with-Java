package Problems.Recursion.ProblemsForConcept.backtracking;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        // 9X9 sudoku board
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };
        if(solveSudoku(board) == true) {
            System.out.println(Arrays.deepToString(board));
        }else{
            System.out.println("This sudoku can't be solved");
        }
    }

    public static boolean solveSudoku(char[][] board){
        int n = board.length;

        int row = -1;
        int col = -1;

        boolean emptyRemain = true;

        //Assigning the value of row and column exactly at next empty value
        for(int r=0; r<n; r++){
            for(int c=0; c<n; c++){
                //If found any empty element in row then break
                if(board[r][c] == '.'){
                    row = r;
                    col = c;
                    emptyRemain = false;
                    break;
                }
            }
            if(emptyRemain == false){
                break;
            }
        }

        if(emptyRemain == true){
            return true;
        }

        for(int num=1; num<=n; num++){
            if(isValid(board, row, col, num)){
                board[row][col] = (char) (num + 48);
                if(solveSudoku(board)){
                    //Found answer
                    return true;
                }else{
                    //Not found answer, then backtrack
                    board[row][col] = '.';
                }
            }
        }

        return false;
    }

    public static boolean isValid(char[][] board, int row, int col, int num){
        //Check row
        for(int i=0; i< board[0].length; i++){
            if(board[row][i] == (char) num + 48){
                return false;
            }
        }

        //Check column
        for(int i=0; i<board.length; i++){
            if(board[i][col] == (char) num + 48){
                return false;
            }
        }

        //Check the block where we are currently at
        int sqrt = (int) Math.sqrt(board.length);

        int rowStart = row - (row % sqrt);
        int colStart = col - (col % sqrt);

        for(int r=rowStart; r<rowStart+sqrt; r++){
            for(int c=colStart; c<colStart+sqrt; c++){
                if(board[r][c] == (char) num + 48){
                    return false;
                }
            }
        }

        return true;
    }
}
