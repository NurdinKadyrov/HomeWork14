package com.company;

public class Person {

     private String name;
     private String desingnation;

    public Person(String name, String desingnation) {
        this.name = name;
        this.desingnation = desingnation;
    }

    public void learn (){
        System.out.println("Learn");
    }
    public void walk(){
        System.out.println("Walk");
    }
    public void eat(){
        System.out.println("Eat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesingnation() {
        return desingnation;
    }

    public void setDesingnation(String desingnation) {
        this.desingnation = desingnation;
    }

}
