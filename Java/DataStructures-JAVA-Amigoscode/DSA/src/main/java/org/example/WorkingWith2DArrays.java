package org.example;

import java.util.Arrays;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        System.out.println("a");
        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = 'a';
            }
        }
        System.out.println(Arrays.deepToString(board));

        char[][] boardTwo = {
                {'a', 'b', 'c'},
                {'a', 'b', 'c'},
                {'a', 'b', 'c'}
        };
        System.out.println(Arrays.deepToString(boardTwo));
    }
}
