package Model;

public class Model {

    boolean playerTurn = false;
    FieldModel view[][] = new FieldModel[3][3];
    int ocupiedSpot;
    boolean symbol;

    /*CONSTRUCTOR*/
    //POR CADA FIELD CREAR UN NUEVO
    public Model() {
        for (FieldModel i : view) {
            i.add(new FieldModel);
        }
    }
    
}
