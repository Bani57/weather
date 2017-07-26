package com.endava.weather;

public class Wind {
    private Double speed;
    private Integer direction;

    public Wind() {
    }

    public Wind(Double speed, Integer direction) {
        this.speed = speed;
        this.direction = direction;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }
    @Override public String toString()
    {
        return "Wind speed: "+speed+"\nWind direction: "+direction;
    }
}
