/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.carlot.service;

import com.sg.carlot.dao.CarLotDAO;
import com.sg.carlot.dto.Car;
import com.sg.carlot.dto.CarKey;
import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author Mason
 */
public class CarLotServiceLayerImpl implements CarLotServiceLayer{

    CarLotDAO dao;
    
    public CarLotServiceLayerImpl (CarLotDAO dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> getAllCars() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Car> getCarsByColor(String color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Car> getCarsInBudget(BigDecimal maxPrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Car> getCarByMakeAndModel(String make, String model) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public BigDecimal discountCar(String VIN, BigDecimal percentDiscount) throws NoSuchCarException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CarKey sellCar(String VIN, BigDecimal cashPaid) throws NoSuchCarException, OverpaidPriceException, UnderpaidPriceException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Car getCar(String VIN) {
        Car car = new Car(VIN);
        dao.addCar(VIN, car);
        
        return car;
    }
    
}
