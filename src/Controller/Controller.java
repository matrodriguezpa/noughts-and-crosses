package Controller;

import Model.*;
import View.*;
import java.awt.event.ActionListener;

public class Controller {

    Model model;
    View view;
    boolean win;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
        this.view.jButton1.addActionListener(Actionlistener);
        this.view.jButton2.addActionListener(Actionlistener2);
    }

    
    // cada listener utiliza las funciones de model 
    //para cambiar los datos en model y actualizar el view
    private final ActionListener Actionlistener = e -> {
        //si el spot ya esta ocupado no cambiara el turno
        if (model.getFiel(1, 1).getSpot(1,1) == 0){
        model.getFiel(1, 1).setSpot(1, 1,model.getTurnInt());
        view.jButton1.setText(model.getTurnString());
        model.setNextTurn();
        }
    };
    private final ActionListener Actionlistener2 = e -> {
        //si el spot ya esta ocupado no cambiara el turno
        if (model.getFiel(1, 1).getSpot(1,2) == 0){
        model.getFiel(1, 1).setSpot(1, 1,model.getTurnInt());
        view.jButton2.setText(model.getTurnString());
        model.setNextTurn();
        }
    };

    public void startGame() {
        view.setVisible(true);
    }

    public boolean setWin() {
        win = true;
        return win;
    }

    public void setSpot() {
        //view.set(o,o);
        model.getFiel(0, 0);
    }

    /*Comprobar tres en raya*/
    //realizar cada cambio de turno
    //Comprobar en el campo seleccionado
    //Comprobar en todo el campo
    //Indicar victoria
}
