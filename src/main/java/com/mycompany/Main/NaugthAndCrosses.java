package com.mycompany.Main;

import com.mycompany.Controller.Controller;
import com.mycompany.Model.Model;
import com.mycompany.View.View;

public class NaugthAndCrosses {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);

        controller.startGame();


    }

}
