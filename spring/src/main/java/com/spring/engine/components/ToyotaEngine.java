package com.spring.engine.components;

import com.spring.engine.interfaces.IEngine;

public class ToyotaEngine implements IEngine {
    String company;
    double cost;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String importOrigin() {
        return "Japan";
    }

    @Override
    public double cost() {
        return cost;
    }

    @Override
    public String toString() {
        return "This is Engine object from" +
                "company='" + company;
    }
}
