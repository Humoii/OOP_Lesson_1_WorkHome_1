package org.example;

import java.util.Objects;

public class Animal {
    private final Classification classification1; // Наземный, Воздушный, Водный
    private final Classification classification2; // Наземный, Воздушный, Водный
    private final Classification classification3; // Наземный, Воздушный, Водный
    private final TypeAnimal type; // плотоядный, травоядный
    private final Integer numberOfLimbs; // количество конечностей
    private final String speciesName; // название вида
    private final Color color; // Окрас
    private  final  String TYPE = this.getClass().getSimpleName();

    public Animal(Classification classification1, 
                  Classification classification2, 
                  Classification classification3, 
                  TypeAnimal type, 
                  Integer numberOfLimbs, 
                  String speciesName, 
                  Color color) {
        this.classification1 = classification1;
        this.classification2 = classification2;
        this.classification3 = classification3;
        this.type = type;
        this.numberOfLimbs = numberOfLimbs;
        this.speciesName = speciesName;
        this.color = color;
    }

    //    методы идёт(toGo), летит(fly), плывёт(swim)
    public void toGo(){
        if ((Objects.requireNonNull(getClassification1()) == Classification.Ground)||
                (Objects.requireNonNull(getClassification2()) == Classification.Ground)||
                (Objects.requireNonNull(getClassification3()) == Classification.Ground)){
            System.out.println(this.TYPE + " идёт");
        }
        else System.out.println(this.TYPE + " не Наземный");
    }
    public void fly(){
        if ((Objects.requireNonNull(getClassification1()) == Classification.Air)||
                (Objects.requireNonNull(getClassification2()) == Classification.Air)||
                (Objects.requireNonNull(getClassification3()) == Classification.Air)){
            System.out.println(this.TYPE + " летит");
        }
        else System.out.println(this.TYPE + " не Воздушный");
    }
    public void swim(){
        if ((Objects.requireNonNull(getClassification1()) == Classification.Water)||
                (Objects.requireNonNull(getClassification2()) == Classification.Water)||
                (Objects.requireNonNull(getClassification3()) == Classification.Water)){
            System.out.println(this.TYPE + " плывёт");
        }
        else System.out.println(this.TYPE + " не Водный");
    }
//    Геттеры

    public String getClassification() {
        String a = "";
        String b = "";
        String c = "";
        if ((Objects.requireNonNull(getClassification1()) != Classification.Null)) {
            a = String.format("%s, ", classification1);
        }
        if ((Objects.requireNonNull(getClassification2()) != Classification.Null)) {
            b = String.format("%s, ", classification2);
        }
        if ((Objects.requireNonNull(getClassification3()) != Classification.Null)) {
            c = String.format("%s, ", classification3);
        }
        return String.format("Классификация: %s", a + b + c);
    }

    private Classification getClassification1() {
        return classification1;
    }

    private Classification getClassification2() {
        return classification2;
    }

    private Classification getClassification3() {
        return classification3;
    }

    public TypeAnimal getType() {
        return type;
    }

    public Integer getNumberOfLimbs() {
        return numberOfLimbs;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public Color getColor() {
        return color;
    }

    public String getTYPE() {
        return TYPE;
    }
}

