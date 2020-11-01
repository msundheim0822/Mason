package com.mycompany.statesandcapitals;

public class Capital {
    
    String name;
    int population;
    double miles;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPopulation(int population) {
        this.population = population;
    }
    
    public void setMiles(double miles) {
        this.miles = miles;
    }
    
    public String getName() {
        return name;
    }
    
    public int getPopulation() {
        return population;
    }
    
    public double getMiles() {
        return miles;
    }
}
