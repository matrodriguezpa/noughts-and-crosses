package Main;

import Model.*;
import Controller.*;
import View.*;

public class Main {

    public static void main(String[] args) {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller();

        controller.startGame(view,model);
        
        System.out.println("Game started");

    }

}
