/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.carlot.dto;

import java.math.BigDecimal;

/**
 *
 * @author Mason
 */
public class Car {
    private String VIN;
    private String make;
    private String model;
    private String color;

    private BigDecimal price;
    private long odometerMiles;

    private CarKey key;
    
    public Car (String VIN) {
        this.VIN = VIN;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    
    public void setOdometerMiles(long odometerMiles) {
        this.odometerMiles = odometerMiles;
    }
    
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }
    
    public String getColor() {
        return color;
    }
    
    public BigDecimal getPrice() {
        return price;
    } 
    
    public long getOdometerMiles() {
        return odometerMiles;
    }
    // plus getters, setters & appropriate constructors
}