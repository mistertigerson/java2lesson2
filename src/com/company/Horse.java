package com.company;

public class Horse extends Animal implements Printable{
    private int speed;
    private String detachment;

    public Horse(String name, String eat, int speed, String detachment) {
        super.setName(name);
        super.setEat(eat);
        this.speed = speed;
        this.detachment = detachment;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDetachment() {
        return detachment;
    }

    public void setDetachment(String detachment) {
        this.detachment = detachment;
    }

    @Override
    public void print() {
        System.out.println("имя: " + getName() + " является " + getEat() + ", скорость которого равна " + speed + ", вид "
                + detachment);
    }
}
