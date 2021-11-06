package com.solvd.companyhierarchy;

import java.util.List;

public class Department {

    private String title;
    private List<Service> services;

    Department(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    private void setTitle(String title) {
        this.title = title;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Service> getServices() {
        return services;
    }

}