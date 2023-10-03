/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import gui.availableVehicleUI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author sisuk
 */
public class vehicleInspection implements vehicleInspector {

    HashMap<String, ArrayList<Object>> vehicleSpecifications = new HashMap<String, ArrayList<Object>>();
    TableModel tm = availableVehicleUI.availableVehiclesTable.getModel();
    DefaultTableModel dtm = (DefaultTableModel) tm;

    @Override
    public HashMap<String, ArrayList<Object>> visit(Car car) {

        if (car.getBookedStatus().equals("NOT BOOKED")) {
            String vehicleNumber = car.getVehicleNumber();
            String bookedStatus = car.getBookedStatus();
            String driver = car.getDrivername();
            String contact = car.getContactNumber();
            String vehicleType = car.getVehicleType();
            ArrayList<Object> arrayList = new ArrayList<Object>();

            arrayList.add(vehicleNumber);
            arrayList.add(bookedStatus);

            Vector v = new Vector();
            v.add(driver);
            v.add(contact);
            v.add(vehicleNumber);
            v.add(vehicleType);
            v.add(bookedStatus);
            dtm.addRow(v);
            vehicleSpecifications.put("CAR", arrayList);
        }
        return vehicleSpecifications;
    }

    @Override
    public HashMap<String, ArrayList<Object>> visit(Van van) {

        if (van.getBookedStatus().equals("NOT BOOKED")) {
            String vehicleNumber = van.getVehicleNumber();
            String bookedStatus = van.getBookedStatus();
            String driver = van.getDrivername();
            String contact = van.getContactNumber();
            String vehicleType = van.getVehicleType();
            ArrayList<Object> arrayList = new ArrayList<Object>();

            arrayList.add(vehicleNumber);
            arrayList.add(bookedStatus);

            Vector v = new Vector();
            v.add(driver);
            v.add(contact);
            v.add(vehicleNumber);
            v.add(vehicleType);
            v.add(bookedStatus);
            dtm.addRow(v);
            vehicleSpecifications.put("VAN", arrayList);
        }
        return vehicleSpecifications;
    }

    @Override
    public HashMap<String, ArrayList<Object>> visit(Motorbike motorbike) {

        if (motorbike.getBookedStatus().equals("NOT BOOKED")) {
            String vehicleNumber = motorbike.getVehicleNumber();
            String bookedStatus = motorbike.getBookedStatus();
            String driver = motorbike.getDrivername();
            String contact = motorbike.getContactNumber();
            String vehicleType = motorbike.getVehicleType();
            ArrayList<Object> arrayList = new ArrayList<Object>();

            arrayList.add(vehicleNumber);
            arrayList.add(bookedStatus);

            Vector v = new Vector();
            v.add(driver);
            v.add(contact);
            v.add(vehicleNumber);
            v.add(vehicleType);
            v.add(bookedStatus);
            dtm.addRow(v);
            vehicleSpecifications.put("BIKE", arrayList);
        }
        return vehicleSpecifications;
    }

}
