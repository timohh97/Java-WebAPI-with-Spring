package com.example.WebApi;

public class Person {

    private String name;
    private String vorname;
    private String alter;

    public Person(String name, String vorname, String alter) {
        this.name = name;
        this.vorname = vorname;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getAlter() {
        return alter;
    }

    public void setAlter(String alter) {
        this.alter = alter;
    }
}
