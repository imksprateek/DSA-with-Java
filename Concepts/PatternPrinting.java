package Concepts;

public class PatternPrinting {
    public static void main(String[] args) {
        printPattern1(4);
        System.out.println();
        printPattern2(4);
        System.out.println();
        printPattern3(4);
        System.out.println();
        printPattern4(4);
        System.out.println();
        printPattern5(5);
        System.out.println();
        printPattern6(5);
        System.out.println();
        printPattern7(5);
        System.out.println();
        printPattern8(4);
        System.out.println();
        printPattern9(4);
        System.out.println();
        printPattern10(4);
    }

    public static void printPattern1(int n) {
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern2(int n) {
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=n; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern3(int n) {
        for(int row=n; row>=1; row--) {
            for(int j=row; j>=1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printPattern4(int n) {
        for(int row=1; row<=n; row++) {
            for(int col=1; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern5(int n) {
        for(int row=1; row<=2*n; row++) {
            if(row < n){
                for(int col=1; col<=row; col++){
                    System.out.print("*");
                }
            }else{
                for(int col=2*n-row; col>=1; col--){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public static void printPattern6(int n){
        for(int row=1; row<=2*n; row++) {
            if(row <= n){
                for(int space = n - row; space>=1; space--){
                    System.out.print(" ");
                }
                for(int col=1; col<=row; col++){
                    System.out.print("* ");
                }
                System.out.println();
            }else{
                for(int space = 1; space<=row-n; space++){
                    System.out.print(" ");
                }
                for(int col=2*n-row; col>=1; col--){
                        System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    public static void printPattern7(int n) {
        for(int row=1; row<=n; row++) {
            for(int space = n-row; space>=1; space--){
                System.out.print("  ");
            }

            for(int col=row; col>1; col--){
                System.out.print(col + " ");
            }
            for(int col=1; col<=row; col++){
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public static void printPattern8(int n) {
        for(int row=1; row<=2*n; row++) {
            if(row <= n){
                for(int space = n-row; space>=1; space--){
                    System.out.print(" ");
                }

                for(int col=row; col>1; col--){
                    System.out.print(col);
                }
                for(int col=1; col<=row; col++){
                    System.out.print(col);
                }
                System.out.println();
            }else{
                for(int space = 1; space <= row-n; space++){
                    System.out.print(" ");
                }

                for(int col=2*n-row; col>1; col--){
                    System.out.print(col);
                }
                for(int col=1; col<=2*n-row; col++){
                    System.out.print(col);
                }
                System.out.println();
            }
        }
    }

    public static void printPattern9(int n) {
        for(int row=0; row<=2*n; row++) {
            for(int col=0; col<=2*n; col++) {
                int left = col;
                int right = 2*n - col;
                int up = row;
                int down = 2*n - row;
                int correctNumber = Math.min(Math.min(left, right), Math.min(up, down));
                System.out.print(correctNumber);
            }
            System.out.println();
        }
    }

    public static void printPattern10(int n) {
        for(int row=0; row<=2*n; row++) {
            for(int col=0; col<=2*n; col++) {
                int left = col;
                int right = 2*n - col;
                int up = row;
                int down = 2*n - row;
                int correctNumber = n - Math.min(Math.min(left, right), Math.min(up, down));
                System.out.print(correctNumber);
            }
            System.out.println();
        }
    }
}
