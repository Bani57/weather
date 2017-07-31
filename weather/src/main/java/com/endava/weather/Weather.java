package com.endava.weather;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Weather {
    @Id
    @GeneratedValue
    private Long data_id;
    private int id;
    private String main;
    private String description;
    private String icon;

    public Weather() {
    }

    public Weather(int id, String main, String description, String icon) {
        this.id = id;
        this.main = main;
        this.description = description;
        this.icon = icon;
    }
    @Override
    public String toString()
    {
        return "Current weather: "+main+"<br/>Description: "+description+"<br/><img src=http://openweathermap.org/img/w/"+icon+".png />";
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
