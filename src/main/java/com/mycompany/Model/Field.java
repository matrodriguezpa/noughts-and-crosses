package com.mycompany.Model;

public class Field {

    int[][] field;

    public Field() {
        field = new int[3][3];

        for (int i = 0; i < field.length - 1; i++) {
            for (int j = 0; j < field[j].length - 1; j++) {
                field[i][j] = 0;
            }
        }
    }

    public void setSpot(int x, int y, int player) {
        field[x][y] = player;
    }

    public int getSpot(int x, int y) {
        return field[x][y];
    }
}
