package com.endava.weather;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Clouds {
    @Id
    @GeneratedValue
    private Long id;
    private Integer all;

    public Clouds() {
    }

    public Clouds(Integer all) {
        this.all = all;
    }

    public Integer getAll() {
        return all;
    }

    public void setAll(Integer all) {
        this.all = all;
    }
    @Override
    public String toString()
    {
        return "Cloud all: "+all;
    }
}
