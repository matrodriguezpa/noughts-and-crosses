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
    }
    
    // SEPARAR ESTE CODIGO EN SOLO METOOS DE MODEL Y VIEW
    public void setX(int FielPositionX, int FielPositionY, int SpotPositionX, int SpotPositionY) {
        //para que el primer turno o un turno indefinido sea donde ubique el jugador,
        //setspot(BUtton.getposition());

        //Se ubica el simbolo en el boton y su modelo correspondiente
        //si el spot ya esta ocupado no cambiara el turno ni el spot y muestra el mensaje
        if (model.getFiel(FielPositionX, FielPositionY)
                .getSpot(SpotPositionX, SpotPositionY) == 0) {
            model.getFiel(FielPositionX, FielPositionY)
                    .setSpot(SpotPositionX, SpotPositionY, model.getTurnInt());
            view.jButton1.setText(model.getTurnString());
            model.setNextTurn();

        //cambiar ubicacion basada en la anterior
            model.setNextTurn();
        } else {
            System.out.println("Spot already occupied");
        }
    }

    // cada listener utiliza las funciones de model 
    //para cambiar los datos en model y actualizar el view
    private final ActionListener Actionlistener = e -> {
        //Controller.setX(1, 1, 1, 1);
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
