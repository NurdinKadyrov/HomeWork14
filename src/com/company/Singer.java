package com.company;

public class Singer extends Person{

    private String bandName;
    public Singer(String name, String desingnation,String bandName) {
        super(name, desingnation);
        this.bandName = bandName;
    }
    public void sigerMethod(){
        System.out.println("Singer");
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    @Override
    public String toString() {
        return "Programmer{ " +getName()+ '\''+
                " Desingnation = " + getDesingnation()+ '\''+
                " BandName = " + getBandName() +
                " }";
    }
}
