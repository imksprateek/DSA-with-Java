package Concepts.Recursion.ProblemsForConcept.pattern;

public class TrianglePattern1Recursion {
    public static void main(String[] args) {
        printPattern1(5);
        System.out.println();
        printPattern2(5,0);
    }

    public static void printPattern1(int n){
        if(n==0){
            return;
        }
        for(int i=0;i<n;i++){
            System.out.print("*\t");
        }
        System.out.println();
        printPattern1(n-1);
    }

    public static void printPattern2(int row, int col){
        if(row == 0){
            return;
        }
        if(col < row) {
            System.out.print("*\t");
            printPattern2(row, col + 1);
        }else{
            System.out.println();
            printPattern2(row-1, 0);
        }
    }
}
