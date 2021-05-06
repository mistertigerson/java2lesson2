package com.company;

public class Ship extends Animal implements Printable{
    private String wool;

    public Ship(String name, String eat, String wool){
        setName(name);
        setEat(eat);
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
        System.out.println("имя: " + getName() + ", является " + getEat() + ", цвет шерсти " + wool);
    }
}
