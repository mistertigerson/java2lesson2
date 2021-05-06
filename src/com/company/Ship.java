package com.company;

public class Ship extends Animal implements Printable{
    private String wool;

    public Ship(String name, String eat, String wool){
        this.name = name;
        this.eat = eat;
        this.wool = wool;
    }

    public String getWool() {
        return wool;
    }

    public void setWool(String wool) {
        this.wool = wool;
    }

    @Override
    public void print() {
        System.out.println(name + eat + wool);
    }
}
