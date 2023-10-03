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
public class Car implements Vehicle{
    private String drivername;
    private String contactNumber;
    private String vehicleNumber;
    private String bookedStatus;
    private String vehicleType;

    public Car(String drivername, String contactNumber, String vehicleNumber, String bookedStatus,String vehicleType) {
        this.drivername = drivername;
        this.contactNumber = contactNumber;
        this.vehicleNumber = vehicleNumber;
        this.bookedStatus = bookedStatus;
        this.vehicleType=vehicleType;
    }

    public String getDrivername() {
        return drivername;
    }

    public void setDrivername(String drivername) {
        this.drivername = drivername;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getBookedStatus() {
        return bookedStatus;
    }

    public void setBookedStatus(String bookedStatus) {
        this.bookedStatus = bookedStatus;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    

    @Override
    public HashMap<String, ArrayList<Object>> accept(vehicleInspector vi) {
        return vi.visit(this);
    }
    
    
}
