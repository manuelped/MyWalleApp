package com.ManuelPedraa.mywalleapp;

public class Account {

    public Account(String name, String descripcion, String color1, String iconoUrl) {
        this.name = name;
        this.descripcion = descripcion;
        this.color1 = color1;
        this.iconoUrl = iconoUrl;
    }

    private String name;
    private String descripcion;
    private String color1;
    private String iconoUrl;

    public String geticonoUrl() {
        return iconoUrl;
    }

    public void seticonoUrl(String iconoUrl) {
        this.iconoUrl = iconoUrl;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getColor1() {
        return color1;
    }

    public void setColor1(String color1) {
        this.color1 = color1;
    }
}
