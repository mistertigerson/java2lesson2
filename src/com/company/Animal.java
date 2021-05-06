package com.company;

public abstract class Animal implements Printable{
    private String name;
    private String eat;

    public void setName(String name){
        this.name = name;

    }

    public String getName(){
        return name;
    }

    public void setEat(String eat){
        this.eat = eat;
    }
    public String getEat(){
        return eat;
    }



}
