package com.tts.Weather.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.tts.Weather.response.Response;

@Service
public class WeatherService {
	
	@Value("${api_key}")
	private String apiKey;
	
	public Response getWeather (String zipCode) {
		String url = "http://api.openweathermap.org/data/2.5/weather?zip="
				+ zipCode + "&units=imperial&appid=" + apiKey;
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate.getForObject (url, Response.class);
	}

}
