package com.playground.daggerplayground.pages.coffees.model;

import com.playground.daggerplayground.data.common.Drink;

import java.util.List;

/**
 * Model for CoffeeActivity.
 * Created by petnagy on 2017. 05. 05..
 */

public class CoffeeActivityModel {

    private boolean isLoggedIn;

    private List<Drink> coffeeList;

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        isLoggedIn = loggedIn;
    }

    public List<Drink> getCoffeeList() {
        return coffeeList;
    }

    public void setCoffeeList(List<Drink> coffeeList) {
        this.coffeeList = coffeeList;
    }
}
