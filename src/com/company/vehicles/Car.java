package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    private String brand;
    private char carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public void start() {
        System.out.println("Поехали");
    }

    public void stop() {
        System.out.println("Останавливаемся");
    }

    public void turnRight() {
        System.out.println("Поворот направо");
    }

    public void turnLeft() {
        System.out.println("Поворот налево");
    }

    @Override
    public String toString() {
        return "Автомобиль " + brand + " " + carClass + " класса. " +
                "Вес: " + weight + " кг. Владелец: " + driver.getFullName() +
                " c опытом вождения - " + driver.getExperience() + " лет " +
                "Двигатель производства: " + engine.getMade() + " и мощностью " +
                engine.getPower() + " л. с.";
    }
}
