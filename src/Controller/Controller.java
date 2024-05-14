package Controller;

import Model.*;
import View.*;

public class Controller {

    Model model;
    View view;
    boolean win;
    
    public Controller() {
    }

    public void startGame(View view,Model model){
        this.view = view;
        this.model = model;
    }

    public boolean setWin() {
        win = true;
        return win;
    }
    
    public void setSpot(){
        model.getFiel(0, 0);
    }

    /*Comprobar tres en raya*/
    //realizar cada cambio de turno
    //Comprobar en el campo seleccionado
    //Comprobar en todo el campo
    //Indicar victoria
}
