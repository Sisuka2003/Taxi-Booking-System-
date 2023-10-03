/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author sisuk
 */
public class dispatcher {

    public void checkAvailablity(ArrayList<Vehicle> vehicles) {
        vehicleInspection inspector = new vehicleInspection();
        for (Vehicle v : vehicles) {
            v.accept(inspector);
        }
    }

}
