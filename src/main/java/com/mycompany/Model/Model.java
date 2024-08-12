package com.mycompany.Model;

public class Model {

    private static int turn;
    private static int[] previusPosition;

    Field model[][] = new Field[3][3];

    public Model() {
        Model.turn = 0;
        for (int i = 0; i < model.length - 1; i++) {
            for (int j = 0; j < model[i].length - 1; j++) {
                model[i][j] = new Field();
            }
        }
    }

    //getter para el turno.
    public static int getTurnAsInt() {
        return Model.turn;
    }

    //Segun el turno se da una 'X' o una 'O'
    public static String getTurnAsString() {
        if (Model.turn == 0 || Model.turn == 1 || Model.turn == 3) {
            return "X";
        } else if (Model.turn == 2 || Model.turn == 4) {
            return "O";
        }
        return "Turno entregado";
    }

    public void setNextTurn() {
        if (Model.turn == 0) {
            Model.turn++;
        } else if (Model.turn == 1 || Model.turn == 3) {
            Model.turn++;
        } else if (Model.turn == 2 || Model.turn == 4) {
            Model.turn--;
        }
        System.out.println("Turno actualizado");
    }

    public Field getFiel(int x, int y) {
        Field field = model[x][y];
        return field;
    }

    public void setNextPosition(int X, int Y, int x, int y) {
        int[] newPreviusPosition = {X, Y, x, y};
        Model.previusPosition = newPreviusPosition;
    }

    public int[] getPreviusPosition() {
        int[] fieldModel = this.previusPosition;
        return fieldModel;
    }
}
