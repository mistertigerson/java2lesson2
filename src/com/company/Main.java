package com.company;

public class Main {


    public static void main(String[] args) {
        Animal horse = createObject("Horse");
        horse.print();

        Animal elephant = createObject("Elephant");
        elephant.print();

        Animal ship = createObject("Ship");
        ship.print();
    }

    public static Animal createObject(String className) {
        switch (className) {
            case ("Horse"):
                Horse horse = new Horse("Лошадка " , "травоядная ", 100, " парнокопытное");
                return horse;
            case ("Elephant"):
                Elephant elephant = new Elephant("Dodo", "орехоядная", "длинный");
                return elephant;
            default:
                Ship ship = new Ship("Анастасия", "травоядная", "белый");
                return ship;

        }
    }

}
