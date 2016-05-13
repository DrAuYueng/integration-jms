package com.spijb.domain;

import java.io.Serializable;

public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    private final Integer deptno;
    private final String name;
    private final String location;

    public Department() {
        deptno = 10;
        name = "SALES";
        location = "TX";
    }

    public Department(Integer dno, String name, String loc) {
        this.deptno = dno;
        this.name = name;
        this.location = loc;
    }

    public Integer getDeptno() {
        return deptno;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return this.deptno + "-> " + this.name + "->" + this.location;
    }

}