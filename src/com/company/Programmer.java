package com.company;

public class Programmer extends Person{

    private String companyName;

    public Programmer(String name, String desingnation, String companyName) {
        super(name, desingnation);
        this.companyName = companyName;
    }

    public void coding(){
        System.out.println("Coding");
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Programmer{ " +getName()+ '\''+
                " Desingnation = " + getDesingnation()+ '\''+
                " CompanyName = " + companyName +
                " }";
    }
}
