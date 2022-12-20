package ru.serebryannikov.voteforlunch.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Vote extends AbstractBaseEntity {

    private LocalDate date;

    private LocalTime time;

    private Long userId;

    private Restaurant restaurant;

    public Vote() {
    }

    public Vote(Long id, LocalDate date, LocalTime time, long userId, Restaurant restaurant) {
        super(id);
        this.date = date;
        this.time = time;
        this.userId = userId;
        this.restaurant = restaurant;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.of(date, time);
    }

    public void setDateTime(LocalDateTime dateTime) {
        date = dateTime.toLocalDate();
        time = dateTime.toLocalTime();
    }

    public Restaurant getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return super.toString() +
                " пользователь " + userId +
                " " + date + " в " + time +
                " голосовал за ресторан " + restaurant;
    }
}
