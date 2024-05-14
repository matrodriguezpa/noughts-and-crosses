package Model;
import java.util.Arrays;

public class Model {
    boolean turn =  false;
    FieldModel model[][] = new FieldModel[3][3];

    public Model() {
         
        for (int i = 0; i < model.length; i++) {
            for (int j = 0; j < model[i].length; j++) {
                model[i][j]= new FieldModel();
            }
        }
    }
    
    public void setNextTurn() {
        this.turn =!this.turn;
    }

    public FieldModel getFiel(int x, int y) {
        FieldModel field = model[x][y];
        return field;
    }

    
    
}
