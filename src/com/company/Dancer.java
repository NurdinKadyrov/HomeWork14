package com.company;


public class Dancer extends Person {
    private String groupName;

    public Dancer(String name, String desingnation, String groupName) {
        super(name, desingnation);
        this.groupName = groupName;
    }
    public void dancerMethod() {
        System.out.println("Dancer");
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Dancer { " +getName()+ '\''+
                " Desingnation = " + getDesingnation()+ '\''+
                " GroupName = " + getGroupName() +
                " }";
    }
}
