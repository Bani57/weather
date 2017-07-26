package com.endava.weather;


public class Prognosis {
    private Coordinates coord;
    private Weather[] weather;
    private String base;
    private MainInfo main;
    private Integer visibility;
    private Wind wind;
    private Clouds clouds;
    private Long dt;
    private SystemInfo sys;
    private Integer id;
    private String name;
    private Integer cod;

    public Prognosis() {
    }

    public Prognosis(Coordinates coord, Weather[] weather, String base, MainInfo main, Integer visibility, Wind wind, Clouds clouds, Long dt, SystemInfo sys, Integer id, String name, Integer cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.visibility = visibility;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }
    @Override
    public String toString()
    {
        return coord.toString()+"\n"+weather[0].toString()+"\nBase: "+base+"\n"+main.toString()+"\nVisibility: "+visibility+"\n"+wind.toString()+"\n"+clouds.toString()+"\nDate: "+dt+"\nCity: "+name;
    }
    public Coordinates getCoord() {
        return coord;
    }

    public void setCoord(Coordinates coord) {
        this.coord = coord;
    }

    public Weather[] getWeather() {
        return weather;
    }

    public void setWeather(Weather[] weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public MainInfo getMain() {
        return main;
    }

    public void setMain(MainInfo main) {
        this.main = main;
    }

    public Integer getVisibility() {
        return visibility;
    }

    public void setVisibility(Integer visibility) {
        this.visibility = visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public void setClouds(Clouds clouds) {
        this.clouds = clouds;
    }

    public Long getDt() {
        return dt;
    }

    public void setDt(Long dt) {
        this.dt = dt;
    }

    public SystemInfo getSys() {
        return sys;
    }

    public void setSys(SystemInfo sys) {
        this.sys = sys;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCod() {
        return cod;
    }

    public void setCod(Integer cod) {
        this.cod = cod;
    }
}
