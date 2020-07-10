package com.tts.Weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.tts.Weather.response.Response;
import com.tts.Weather.service.WeatherService;

@Controller
public class WeatherController {

	@Autowired
	private WeatherService weatherService;
	
	@GetMapping
	public String getIndex (Model model) {
		Response response = weatherService.getWeather("06511");
		model.addAttribute("data", response);
		return "index";
	}
}
