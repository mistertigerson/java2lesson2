package com.company;

public class Elephant extends Animal implements Printable{
    private String proboscis;

    public Elephant(String name, String eat, String proboscis) {
        setName(name);
        setEat(eat);
        this.proboscis = proboscis;
    }

    public String getProboscis() {
        return proboscis;
    }

    public void setProboscis(String proboscis) {
        this.proboscis = proboscis;
    }

    @Override
    public void print() {
        System.out.println("имя: " + getName() + ", является " + getEat() + ", хобот " +proboscis);
    }
}
