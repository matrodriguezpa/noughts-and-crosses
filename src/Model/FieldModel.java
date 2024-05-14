package Model;

import Controller.*;

public class FieldModel {

    boolean field[][];

    public FieldModel() {
        field = new boolean[3][3];
    }

    public void setSpot(int x, int y, boolean player) {
        if (field[x][y] == true || field[x][y] == false) {
        } else {
            field[x][y] = player;
        }
        //cambiar el turno
    }
}
