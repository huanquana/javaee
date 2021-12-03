package com.test.study.dao2;

public class dao2_school2 {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "dao2_school1{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
