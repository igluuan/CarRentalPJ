package com.luandev;

import com.luandev.entities.Car;
import com.luandev.entities.Invoice;
import com.luandev.entities.RentalCar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Car car = new Car("Civic");
        Date d1 = sdf.parse("25-06-2018 10:30:00");
        Date d2 = sdf.parse("25-06-2018 14:40:00");
        Invoice in = new Invoice(d1, d2, car);
        System.out.println(in.basicPayment(10));
        System.out.println(in.tax(10));
        System.out.println(in.totalPayment(10));
    }
}