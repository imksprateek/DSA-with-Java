package Concepts.Recursion.ProblemsForConcept.pattern;

public class TrianglePattern2Recursion {
    public static void main(String[] args) {
        printPattern(5,0);
    }

    public static void printPattern(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row){
            printPattern(row, col+1);
            System.out.print("*\t");
        }else{
            printPattern(row-1, 0);
            System.out.println();
        }
    }
}
