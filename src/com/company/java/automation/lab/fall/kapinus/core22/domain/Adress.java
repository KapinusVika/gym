package com.java.automation.lab.fall.kapinus.core22.domain;

import java.io.Serializable;

public class Adress implements Serializable {
    private String city;
    private String street;
    private int build;
    private int apt;

    public Adress(String city, String street, int build, int apt){
        this.city = city;
        this.street = street;
        this.build = build;
        this.apt = apt;
    }

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city = city;
    }

    public String getStreet(){
        return street;
    }

    public void setStreet(String street){
        this.street = street;
    }

    public int getBuild(){
        return build;
    }

    public void setBuild(int build){
        this.build = build;
    }

    public int getApt(){
        return apt;
    }

    public void setApt(int apt){
        this.apt = apt;
    }

    @Override
    public String toString() {
        return "Adress {\n\tcity:" + city +
                "\n\tstreet:" + street +
                "\n\tbuild:" + Integer.toString(build) +
                "\n\tapt:" + Integer.toString(apt) +
                "\n}";
    }

    @Override
    public boolean equals(Object that) {
        if (that == null) {
            return false;
        }
        if (this.getClass() != that.getClass()) {
            return false;
        }
        if (this == that) {
            return true;
        }
        return  city.equals(((Adress)that).city) &&
                street.equals(((Adress)that).street) &&
                build == ((Adress)that).build &&
                apt == ((Adress)that).apt;
    }

    @Override
    public int hashCode() {
        return (apt + street.hashCode() ) * build;
    }
}



