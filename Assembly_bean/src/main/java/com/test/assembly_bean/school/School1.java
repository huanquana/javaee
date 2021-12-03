package com.test.assembly_bean.school;

public class School1 {
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
        return "School1{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
