package ru.serebryannikov.voteforlunch.model;

import java.util.List;

public class Restaurant extends AbstractNamedEntity {

    private String address;

    private List<Dish> dishes;

    public Restaurant() {
    }

    public Restaurant(Long id, String name, String address) {
        super(id, name);
        this.address = address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public List<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(List<Dish> dishes) {
        this.dishes = dishes;
    }
}
