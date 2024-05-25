package Concepts.Algorithms.Searching.BinarySearch;

import java.util.Arrays;

public class FullySorted2DArrayBinarySearch {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(Arrays.toString(Search(matrix, 7)));
        System.out.println(Arrays.toString(Search(matrix, 12)));
        System.out.println(Arrays.toString(Search(matrix, 3)));
    }

    public static int[] Search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (rows == 1) {
            return SearchRow(matrix, 0, 0, cols - 1, target);
        }
        if (cols == 1) {
            return searchCol(matrix, 0, 0, rows - 1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }
            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }
        if (target < matrix[rStart][cMid]) {
            return SearchRow(matrix, rStart, 0, cMid - 1, target);
        }
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return SearchRow(matrix, rStart, cMid + 1, cols - 1, target);
        }
        if (target < matrix[rStart + 1][cMid]) {
            return SearchRow(matrix, rStart + 1, 0, cMid - 1, target);
        } else {
            return SearchRow(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }

    }

    public static int[] SearchRow(int[][] matrix, int row, int colStart, int colEnd, int target) {
        while (colStart <= colEnd) {
            int mid = colStart + (colEnd - colStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (target > matrix[row][mid]) {
                colStart = mid + 1;
            }
            if (target < matrix[row][mid]) {
                colEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] searchCol(int[][] matrix, int col, int rowStart, int rowEnd, int target) {
        while (rowStart <= rowEnd) {
            int mid = rowStart + (rowEnd - rowStart) / 2;
            if (target == matrix[mid][col]) {
                return new int[]{mid, col};
            }
            if (target > matrix[mid][col]) {
                rowStart = mid + 1;
            } else {
                rowEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}
