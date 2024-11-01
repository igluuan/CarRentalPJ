package com.luandev.entities;

import java.util.Date;

public class Invoice extends RentalCar {
    public Invoice(Date start, Date finish, Car car) {
        super(start, finish, car);
    }

    public double basicPayment(int perHour) {
        long durationInMillis = finish.getTime() - start.getTime();
        double durationInHours = (double) durationInMillis / (1000 * 60 * 60); // Converter milissegundos para horas
        long roundedDurationInHours = (long) Math.ceil(durationInHours); // Arredonda para cima

        return roundedDurationInHours * perHour;
    }

    public double tax(int perHour) {
        double basicPayment = basicPayment(perHour);
        return basicPayment * 0.20; // Taxa de 20%
    }

    public double totalPayment(int perHour) {
        return basicPayment(perHour) + tax(perHour);
    }
}
