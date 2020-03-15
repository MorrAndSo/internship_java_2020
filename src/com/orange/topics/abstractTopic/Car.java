package com.orange.topics.abstractTopic;

public abstract class Car {
    private String culoare;
    private Integer nrRoti;
    private Boolean isDiesel;

    public Car() {
    }

    public Car(String culoare, Integer nrRoti, Boolean isDiesel) {
        this.culoare = culoare;
        this.nrRoti = nrRoti;
        this.isDiesel = isDiesel;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public Integer getNrRoti() {
        return nrRoti;
    }

    public void setNrRoti(Integer nrRoti) {
        this.nrRoti = nrRoti;
    }

    public Boolean getDiesel() {
        return isDiesel;
    }

    public void setDiesel(Boolean diesel) {
        isDiesel = diesel;
    }

    public abstract String getMarca ();

    @Override
    public String toString() {
        return "culoare='" + culoare + '\'' +
                ", nrRoti=" + nrRoti +
                ", isDiesel=" + isDiesel;
    }
}
