package ru.serebryannikov.voteforlunch.model;

import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class Dish extends AbstractNamedEntity {

    private Integer price;

    private LocalDate date;

    private Restaurant restaurant;

    public Dish() {
    }

    public Dish(Integer id, String name, Integer price, LocalDate date) {
        super(id, name);
        this.price = price;
        this.date = date;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }
}
