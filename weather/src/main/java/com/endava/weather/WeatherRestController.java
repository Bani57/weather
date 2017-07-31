
package com.endava.weather;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
/*
@RestController
public class WeatherRestController {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @RequestMapping("/")
    public String getFullWeatherPrognosis()
    {
        RestTemplate restTemplate=new RestTemplate();
        Prognosis prognosis = restTemplate.getForObject(
                "http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1", Prognosis.class);
        return prognosis.toString();
    }

    @RequestMapping("/weather")
    public String getWeatherInfo()
    {
        RestTemplate restTemplate=new RestTemplate();
        Prognosis prognosis = restTemplate.getForObject(
                "http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1", Prognosis.class);
        return prognosis.getWeather()[0].toString();
    }

    @RequestMapping("/main")
    public String getMainInfo()
    {
        RestTemplate restTemplate=new RestTemplate();
        Prognosis prognosis = restTemplate.getForObject(
                "http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1", Prognosis.class);
        return prognosis.getMain().toString();
    }

    @RequestMapping("/system")
    public String getSystemInfo()
    {
        RestTemplate restTemplate=new RestTemplate();
        Prognosis prognosis = restTemplate.getForObject(
                "http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1", Prognosis.class);
        return prognosis.getSys().toString();
    }


}*/
