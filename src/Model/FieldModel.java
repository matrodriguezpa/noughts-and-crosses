package Model;

import Controller.*;

public class FieldModel {

    int field[][];

    public FieldModel() {
        field = new int[3][3];
    }
/*
    public void setSpot(int x, int y, boolean player) {
        if (field[x][y] == true || field[x][y] == false) {
        } else {
            field[x][y] = player;
        }
    }*/
    
    public void setSpot(int x, int y, int player) {
            field[x][y] = player;
    }

    public int getSpot(int x, int y) {
        return field[x][y];
    }
}
