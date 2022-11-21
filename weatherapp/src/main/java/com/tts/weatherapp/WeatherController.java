package com.tts.weatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class WeatherController {
    @Autowired
    private WeatherService weatherService;

    public String getIndex(Model model) {
        Response response = weatherService.getForecast("43210");
        model.addAttribute("data", response);
        return "index";

   

}
}
