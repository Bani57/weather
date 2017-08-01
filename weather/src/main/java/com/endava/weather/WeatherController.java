package com.endava.weather;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.Date;

@Controller
public class WeatherController {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @RequestMapping("/")
    public String welcome()
    {
        return "welcome";
    }

    @Value("${token}")
    private String token;
    @Value("${skopje_id}")
    private String id;

    @RequestMapping("/{city}")
    public String getFullPrognosis(@PathVariable String city, Model model)
    {
        RestTemplate restTemplate=restTemplate(new RestTemplateBuilder());
        Prognosis prognosis = restTemplate.getForObject(
                "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+token, Prognosis.class);
        model.addAttribute("city",city);
        model.addAttribute("lon",prognosis.getCoord().getLon());
        model.addAttribute("lat",prognosis.getCoord().getLat());
        model.addAttribute("weather_main",prognosis.getWeather()[0].getMain());
        model.addAttribute("weather_description",prognosis.getWeather()[0].getDescription());
        model.addAttribute("icon",prognosis.getWeather()[0].getIcon());
        model.addAttribute("temp",prognosis.getMain().getTemp().intValue()-273);
        model.addAttribute("temp_min",prognosis.getMain().getTemp_min().intValue()-273);
        model.addAttribute("temp_max",prognosis.getMain().getTemp_max().intValue()-273);
        model.addAttribute("tempf",new Double((prognosis.getMain().getTemp()-273)*1.8+32).intValue());
        model.addAttribute("temp_minf",new Double((prognosis.getMain().getTemp_min()-273)*1.8+32).intValue());
        model.addAttribute("temp_maxf",new Double((prognosis.getMain().getTemp_max()-273)*1.8+32).intValue());
        model.addAttribute("pressure",prognosis.getMain().getPressure());
        model.addAttribute("humidity",prognosis.getMain().getHumidity());
        model.addAttribute("visibility",prognosis.getVisibility());
        model.addAttribute("speed",prognosis.getWind().getSpeed());
        model.addAttribute("deg",prognosis.getWind().getDeg());
        model.addAttribute("all",prognosis.getClouds().getAll());
        model.addAttribute("country",prognosis.getSys().getCountry());
        Date sunrise=new Date(prognosis.getSys().getSunrise()*1000);
        Date sunset=new Date(prognosis.getSys().getSunset()*1000);
        model.addAttribute("sunrise", sunrise.toString());
        model.addAttribute("sunset", sunset.toString());
        return "weatherFull";
    }
    @RequestMapping("/{city}/main")
    public String getMainPrognosis(@PathVariable String city, Model model)
    {
        RestTemplate restTemplate=restTemplate(new RestTemplateBuilder());
        Prognosis prognosis = restTemplate.getForObject(
                "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+token, Prognosis.class);
        model.addAttribute("city",city);
        model.addAttribute("temp",prognosis.getMain().getTemp().intValue()-273);
        model.addAttribute("temp_min",prognosis.getMain().getTemp_min().intValue()-273);
        model.addAttribute("temp_max",prognosis.getMain().getTemp_max().intValue()-273);
        model.addAttribute("tempf",new Double((prognosis.getMain().getTemp()-273)*1.8+32).intValue());
        model.addAttribute("temp_minf",new Double((prognosis.getMain().getTemp_min()-273)*1.8+32).intValue());
        model.addAttribute("temp_maxf",new Double((prognosis.getMain().getTemp_max()-273)*1.8+32).intValue());
        model.addAttribute("pressure",prognosis.getMain().getPressure());
        model.addAttribute("humidity",prognosis.getMain().getHumidity());
        return "weatherMain";
    }
    @RequestMapping("/{city}/weather")
    public String getWeatherPrognosis(@PathVariable String city, Model model)
    {
        RestTemplate restTemplate=restTemplate(new RestTemplateBuilder());
        Prognosis prognosis = restTemplate.getForObject(
                "http://api.openweathermap.org/data/2.5/weather?q="+city+"&appid="+token, Prognosis.class);
        model.addAttribute("city",city);
        model.addAttribute("weather_main",prognosis.getWeather()[0].getMain());
        model.addAttribute("weather_description",prognosis.getWeather()[0].getDescription());
        model.addAttribute("icon",prognosis.getWeather()[0].getIcon());
        return "weatherWeather";
    }
}
