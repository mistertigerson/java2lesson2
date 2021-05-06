package com.company;

public class Elephant extends Animal implements Printable{
    private String proboscis;

    public Elephant(String name, String eat, String proboscis) {
        this.name = name;
        this.eat = eat;
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
        System.out.println(name + eat + proboscis);
    }
}
