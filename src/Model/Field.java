package Model;

public class Field {

    int field[][];

    public Field() {
        field = new int[3][3];
    }

    public void setSpot(int x, int y, int player) {
        field[x][y] = player;
    }

    public int getSpot(int x, int y) {
        return field[x][y];
    }
}
