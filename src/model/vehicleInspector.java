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
public interface vehicleInspector {

    HashMap<String, ArrayList<Object>> visit(Car car);

    HashMap<String, ArrayList<Object>> visit(Van van);

    HashMap<String, ArrayList<Object>> visit(Motorbike motorbike);

}
