package com.codegym.task.task21.task2113;

import java.util.Random;

public class Horse {

    public void move(){
        Random random = new Random();
        distance += speed * Math.random();

    }

    public void print(){
        int counter = (int) Math.floor(distance);
        for (int i = 0; i < counter; i++) {
            System.out.print(".");
        }
        System.out.println(name);
    }

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    private String name;
    private double speed;
    private double distance;
    
}
