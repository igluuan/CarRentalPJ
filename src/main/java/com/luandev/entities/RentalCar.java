package com.luandev.entities;

import java.util.Date;

public class RentalCar {
    protected Date start;
    protected Date finish;
    private Car car;

    public RentalCar(Date start, Date finish, Car car) {
        this.start = start;
        this.finish = finish;
        this.car = car;
    }

    public Date getStart() {
        return start;
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getFinish() {
        return finish;
    }

    public void setFinish(Date finish) {
        this.finish = finish;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
