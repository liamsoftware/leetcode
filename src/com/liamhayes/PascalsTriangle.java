package com.liamhayes;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {
        int numRows = 5;
        System.out.println(generate(numRows));
    }

    public static List<List<Integer>> generate(int numRows) {

        //return a list of ints that sum up to the numRows
        // in => 5
        // out => [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

        List<List<Integer>> allRows = new ArrayList<>();
        List<Integer> row = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            allRows.add(new ArrayList<>(row));
        }
        return allRows;
    }

}
