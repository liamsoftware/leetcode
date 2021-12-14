package com.liamhayes;

public class ValueAfterPerformingOps {

    public static void main(String[] args) {
        String[] operations = {"--X", "--X", "X--", "X++", "++X"};
        System.out.println(finalValueAfterOperations(operations));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            if (op.equals("--X") || op.equals("X--")) {
                x--;
            } else {
                x++;
            }
        }
        return x;
    }
}
