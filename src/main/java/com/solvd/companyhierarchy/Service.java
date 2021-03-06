package com.solvd.companyhierarchy;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
public class Service {

    @XmlElement(name = "name")
    private String title;
    @XmlElement
    private double price;

    public Service(){

    }

    public Service(String title, double price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString(){
        return title + " costs " + price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
