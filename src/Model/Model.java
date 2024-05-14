package Model;

public class Model {
    
    int turn = 1;
    FieldModel model[][] = new FieldModel[3][3];

    public Model() {
         
        for (int i = 0; i < model.length; i++) {
            for (int j = 0; j < model[i].length; j++) {
                model[i][j]= new FieldModel();
                
            }
        }
    }
    
    public int getTurnInt(){
        return this.turn;
    }
    
    public String getTurnString(){
        String turn = "";
        if (this.turn == 1){
        turn ="X";
        }else if(this.turn == 2){
        turn="O";
        }
        return turn;
    }
    
    public void setNextTurn() {
        if (this.turn == 1){
        this.turn++;
        }else if(this.turn == 2){
        this.turn--;
        }
    }

    public FieldModel getFiel(int x, int y) {
        FieldModel field = model[x][y];
        return field;
    }

    
    
}
