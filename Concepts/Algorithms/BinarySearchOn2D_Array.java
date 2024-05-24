package Concepts.Algorithms;

import java.util.Arrays;

public class BinarySearchOn2D_Array {
    public static void main(String[] args) {
        int[][] matrix = {{1, 3, 5},
                {2, 4, 6},
                {7, 8, 9}};
        System.out.println(Arrays.toString(search(matrix, 8)));
        System.out.println(Arrays.toString(search(matrix, 4)));
        System.out.println(Arrays.toString(search(matrix, 9)));
        System.out.println(Arrays.toString(search(matrix, 13)));
    }

    public static int[] search(int[][] matrix, int target) {
        int row = 0;
        int col = matrix.length - 1;
        while (row < matrix.length && col > 0) {
            if (target == matrix[row][col]) {
                return new int[]{row, col};
            }
            if (target > matrix[row][col]) {
                row++;
            } else {
                col--;
            }
        }
        return new int[]{-1, -1};
    }
}
