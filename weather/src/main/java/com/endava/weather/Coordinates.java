package com.endava.weather;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Coordinates {
    @Id
    @GeneratedValue
    private Long id;
    private Double lon;
    private Double lat;

    public Coordinates() {
    }

    public Coordinates(Double lon, Double lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }
    @Override
    public String toString()
    {
        return "Longitude: "+lon+"<br/>Latitude: "+lat;
    }
}
