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
    //###########ROADS DEFINES##########
    //#NAME-DIFFICULTY-SIZE-LAPS
    public static ArrayList<Road> ArrayListRoads(){
        ArrayList<Road> roads = new ArrayList<Road>();
        
        Road Sakhir     = new Road("Sakhir, Bahrein",                       7f, 6299, 36);
        Road Melbourne  = new Road("Albert Park, Australia",                6f, 5303, 63);
        Road Kuala      = new Road("Sepang International Circuit, Malasia", 3f, 5543, 57);
        Road Xangai     = new Road("Shanghai International Circuit, China", 8f, 5451, 39);
        Road Catalunha  = new Road("Catalunha, Espanha",                    6f, 4655, 78);
            
        roads.add(Sakhir);
        roads.add(Melbourne);
        roads.add(Kuala);
        roads.add(Xangai);
        roads.add(Catalunha);
        
        return roads;
    }
    //http://travinha.com.br
    //https://pt.wikipedia.org
    //##################################
    
    //############CARS DEFINES##########
    //NAME-VEL_MAX-FUEL_MAX
    public static ArrayList<Car> ArrayListCars(){
        ArrayList<Car> cars = new ArrayList<Car>();
        
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
            
        cars.add(Koenigsegg_One);
        cars.add(Hennessey_Venom_GT);
        cars.add(Bugatti_Veyron_Super_Sport);
        cars.add(SSC_Ultimate_Aero_TT);
        cars.add(Koenigsegg_Agera_R);
        cars.add(Bugatti_Chiron);
        cars.add(_9ff_Porsche_GT9_R);
        cars.add(Saleen_S7_Twin_Turbo);
        cars.add(McLaren_F1);
        cars.add(Pagani_Huayra);
        
        return cars;
    }
    //https://andrebona.com.br
    //https://www.carrosnaweb.com.br
    //https://pt.wikipedia.org
    //##################################
    
    //############CARS DEFINES##########
    //NAME-VEL_MAX-FUEL_MAX
    public static ArrayList<Pilot> ArrayListPilots(){
        ArrayList<Pilot> pilots = new ArrayList<Pilot>();
        
        Pilot Ayrton_Senna       = new Pilot("Ayrton Senna", 10, 10);
        Pilot Michael_Schumacher = new Pilot("Michael Schumacher", 9, 9);
        Pilot Juan_Manuel_Fangio = new Pilot("Juan Manuel Fangio", 9, 9);
        Pilot Alain_Prost        = new Pilot("Alain Prost", 9, 8);
        Pilot Jim_Clark          = new Pilot("Jim Clark", 8, 9);
        Pilot Jackie_Stewart     = new Pilot("Jackie Stewart", 8, 8);
        Pilot Niki_Lauda         = new Pilot("Niki Lauda", 8, 8);
        Pilot Stirling_Moss      = new Pilot("Stirling Moss", 8, 7);
        Pilot Fernando_Alonso    = new Pilot("Fernando Alonso", 7, 8);
        Pilot Gilles_Villeneuve  = new Pilot("Gilles Villeneuve", 8, 6);
            
        pilots.add(Ayrton_Senna);
        pilots.add(Michael_Schumacher);
        pilots.add(Juan_Manuel_Fangio);
        pilots.add(Alain_Prost);
        pilots.add(Jim_Clark);
        pilots.add(Jackie_Stewart);
        pilots.add(Niki_Lauda);
        pilots.add(Stirling_Moss);
        pilots.add(Fernando_Alonso);
        pilots.add(Gilles_Villeneuve);
        
        return pilots;
    }
    //https://pt.wikipedia.org
    //##################################
    
    
}
