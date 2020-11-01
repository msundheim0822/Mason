package com.sg.vm.dto;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {
    
    private String name;    
    private BigDecimal cost;    
    private int amount;
    
    public Item(String name) {
        this.name = name;
    }
    
    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 43 * hash + Objects.hashCode(this.name);
        hash = 43 * hash + Objects.hashCode(this.cost);
        hash = 43 * hash + this.amount;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Item other = (Item) obj;
        if (this.amount != other.amount) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.cost, other.cost)) {
            return false;
        }
        return true;
    }
    
    public void setAmount(int amount) {
        this.amount = amount;
    }
    
    public String getName() {
        return name;
    }
    
    public BigDecimal getCost() {
        return cost;
    }
    
    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Item{" + "name=" + name + ", cost=" + cost + ", amount=" + amount + '}';
    }
}