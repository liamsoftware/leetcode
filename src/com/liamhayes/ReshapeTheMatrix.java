package com.liamhayes;

import java.util.Arrays;

public class ReshapeTheMatrix {

    public static void main(String[] args) {
        int[][] array = {{1,2}, {3,4}};
        int r = 1, c = 4;
        System.out.println(Arrays.deepToString(matrixReshape(array, r, c)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] out = new int[r][c];

        //what if we get r and c that cannot take the size of mat?
        //in = 2x2=4 out 1x4=4
        int matDim = mat.length * mat[0].length;
        int outDim = r * c;
        if (matDim != outDim) return mat;

        //keep pointer to current pos of mat
        //loop over out and add pointer at ij position
        int currentRow = 0;
        int currentCol = 0;

        for (int row = 0; row < out.length; row++) {
            for (int col = 0; col < out[0].length; col++) {
                out[row][col] = mat[currentRow][currentCol++];
                if (currentCol == mat[0].length) {
                    currentCol = 0;
                    currentRow++;
                }
            }
        }
        return out;
    }
}
