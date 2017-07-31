package com.endava.weather;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Wind {
    @Id
    @GeneratedValue
    private Long id;
    private Double speed;
    private Double deg;

    public Wind() {
    }

    public Wind(Double speed, Double deg) {
        this.speed = speed;
        this.deg = deg;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getDeg() {
        return deg;
    }

    public void setDeg(Double deg) {
        this.deg = deg;
    }
    @Override
    public String toString()
    {
        return "Wind speed: "+speed+"<br/>Wind direction: "+deg;
    }
}
