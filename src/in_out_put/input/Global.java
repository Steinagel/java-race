/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package in_out_put.input;

import race_objects.*;
import java.util.ArrayList; 
/**
 *
 * @author will_
 */
public class Global {
    ArrayList<Road> roads = new ArrayList<Road>();
    ArrayList<Car> cars = new ArrayList<Car>();
    ArrayList<Pilot> pilots = new ArrayList<Pilot>();
    
    //###########ROADS DEFINES##########
    //#NAME-DIFFICULTY-SIZE-LAPS
    Road Sakhir     = new Road("Sakhir, Bahrein",                       7f, 6299, 12);
    Road Melbourne  = new Road("Albert Park, Australia",                6f, 5303, 21);
    Road Kuala      = new Road("Sepang International Circuit, Malasia", 3f, 5543, 19);
    Road Xangai     = new Road("Shanghai International Circuit, China", 8f, 5451, 13);
    Road Catalunha  = new Road("Catalunha, Espanha",                    6f, 4655, 26);
    
    //http://travinha.com.br
    //https://pt.wikipedia.org
    //##################################
    
    
    //############CARS DEFINES##########
    //NAME-VEL_MAX-FUEL_MAX
    Car Koenigsegg_One              = new Car("Koenigsegg One:1",           440f, 74);
    Car Hennessey_Venom_GT          = new Car("Hennessey Venom GT",         435f, 70);
    Car Bugatti_Veyron_Super_Sport  = new Car("Bugatti Veyron Super Sport", 431f,100);
    Car SSC_Ultimate_Aero_TT        = new Car("SSC Ultimate Aero TT",       430f,100);
    Car Koenigsegg_Agera_R          = new Car("Koenigsegg Agera R",         420f, 80);
    Car Bugatti_Chiron              = new Car("Bugatti Chiron",             420f,100);
    Car _9ff_Porsche_GT9_R          = new Car("9ff Porsche GT9-R",          414f, 92);
    Car Saleen_S7_Twin_Turbo        = new Car("Saleen S7 Twin Turbo",       399f, 72);
    Car McLaren_F1                  = new Car("McLaren F1",                 391f, 72);
    Car Pagani_Huayra               = new Car("Pagani Huayra",              370f, 70);

    //https://andrebona.com.br
    //https://www.carrosnaweb.com.br
    //https://pt.wikipedia.org
    //##################################
    
    //############CARS DEFINES##########
    //NAME-VEL_MAX-FUEL_MAX
    Pilot Ayrton_Senna = new Pilot("Ayrton Senna", 10, 10);
    

    //https://pt.wikipedia.org
    //##################################
}
