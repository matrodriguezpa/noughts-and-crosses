package Model;

public class Model {
    
    int turn = 1;
    int turnFieldX;
    int turnFieldY;
    Field model[][] = new Field[3][3];

    public Model() {
         
        for (int i = 0; i < model.length; i++) {
            for (int j = 0; j < model[i].length; j++) {
                model[i][j]= new Field();
                
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

    public Field getFiel(int x, int y) {
        Field field = model[x][y];
        return field;
    }
    
    public void setTurnField(int x, int y){
        this.turnFieldX = x;
        this.turnFieldY = y;
    }
    
    public Field getTurnField(){
        Field fieldModel= model[this.turnFieldX][this.turnFieldX];
        return fieldModel;
    }
}
