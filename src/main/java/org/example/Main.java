package org.example;

public class Main {
    public static void main(String[] args) {
////////////////////////////////////////////////////////////////////////////////
        Duck duck = new Duck(
                Classification.Air,
                Classification.Ground,
                Classification.Water,
                TypeAnimal.Herbivorous,
                4,
                "Утка",
                Color.MOTLEY);
        System.out.println(duck.getSpeciesName());
        System.out.println(duck.getClassification());
        duck.swim();
        duck.fly();
        duck.toGo();
/////////////////////////////////////////////////////////////////////////////////
        Tiger tiger = new Tiger(
                Classification.Ground,
                Classification.Null,
                Classification.Null,
                TypeAnimal.Carnivorous,
                4,
                "Тигр",
                Color.BRINDLE);
        System.out.println(tiger.getSpeciesName());
        System.out.println(tiger.getClassification());
        tiger.swim();
        tiger.fly();
        tiger.toGo();
/////////////////////////////////////////////////////////////////////////////////
        Dolphin dolphin = new Dolphin(
                Classification.Water,
                Classification.Null,
                Classification.Null,
                TypeAnimal.Carnivorous,
                2,
                "Дельфин",
                Color.WHITE);
        System.out.println(dolphin.getSpeciesName());
        System.out.println(dolphin.getClassification());
        dolphin.fly();
        dolphin.swim();
        dolphin.toGo();
/////////////////////////////////////////////////////////////////////////////////
        Siskin siskin = new Siskin(
                Classification.Air,
                Classification.Null,
                Classification.Null,
                TypeAnimal.Herbivorous,
                4,
                "Чиж",
                Color.MOTLEY);
        System.out.println(siskin.getSpeciesName());
        System.out.println(siskin.getClassification());
        siskin.fly();
        siskin.swim();
        siskin.toGo();
    }
}