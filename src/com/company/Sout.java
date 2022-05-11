package com.company;

public class Sout {
    public void sout(){

        Programmer prog = new Programmer("Nurdin","Hacer","Peaksoft");
        System.out.println(prog);
        prog.learn();
        prog.eat();
        prog.walk();
        prog.coding();
        Dancer dancer = new Dancer("Dastan","Dancer","BabyMIX");
        System.out.println(dancer);
        dancer.learn();
        dancer.eat();
        dancer.walk();
        dancer.dancerMethod();
        Singer singer = new Singer("Jaulan","Singer","Curltay");
        System.out.println(singer);
        singer.learn();
        singer.eat();
        singer.walk();
        singer.sigerMethod();
    }
}
