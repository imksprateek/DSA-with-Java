package Problems.Recursion.ProblemsForConcept.backtracking;

public class NBishopsProblem {
    public static void main(String[] args) {
        System.out.println("Number of ways: " + Nbishops(new boolean[4][4], 0,0,4));
    }

    public static int Nbishops(boolean[][] board, int row, int col, int bishops){
        if(bishops == 0){
            displayArray(board);
            System.out.println();
            return 1;
        }

        int count = 0;

        if(row == board.length){
            return count;
        }

        if(col == board[0].length){
            return Nbishops(board, row+1, 0, bishops);
        }

        if(col == board[0].length){
            count += Nbishops(board, row+1, 0, bishops);
        }

        if(notUnderAttack(board, row, col)){
            board[row][col] = true;
            count += Nbishops(board, row, col+1, bishops-1);
            board[row][col] = false;
        }

        count += Nbishops(board, row, col+1, bishops);

        return count;

    }

    private static boolean notUnderAttack(boolean[][] board, int row, int col) {
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
                    System.out.print("B ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
