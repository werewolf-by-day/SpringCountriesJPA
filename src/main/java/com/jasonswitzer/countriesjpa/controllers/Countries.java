package com.jasonswitzer.countriesjpa.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jasonswitzer.countriesjpa.models.*;
import com.jasonswitzer.countriesjpa.services.WorldService;

@Controller
public class Countries {
	
	private WorldService worldService;
	
	public Countries(WorldService worldService) {
		this.worldService = worldService;
	}
	
	@RequestMapping("/")
	public String Index(Model model) {
		
		//Task 1
		//Return name of the country, language and language percentage for Slovene speaking Countries in desc order
		List<Object[]> sloveneCountries = worldService.findCountriesSpeakingSlovene();
		model.addAttribute("sloveneCountries", sloveneCountries);
		
		//Task 2
		//Return name of the country and cities for total number of cities for each country in descending order
		List<Object[]> cityCountByCountry = worldService.findCitiesCountByCountry();
		model.addAttribute("cityCountByCountry", cityCountByCountry);
	
		//Task 3
		//Return all cities in Mexico w/population greater than 500,00 in descending order
		List<City> mexicanCities = worldService.findMexicanCities();
		model.addAttribute("mexicanCities", mexicanCities);
		
		//Task 4
		//Return all languages in each country w/a percentage greater than 89% in descending order
		List<Object[]> languagesByCountry = worldService.findLargeLanguagePercentageByCountry();
		model.addAttribute("languagesByCountry", languagesByCountry);
		
		//Task 5
		//Return all countries with surface area below 501 and population greater than 100,000
		List<Country> smallCountries = worldService.findSmallCountries();
		model.addAttribute("smallCountries", smallCountries);
		
		//Task 6
		//Return all countries w/only Constitutional Monarchy w/capital greater 200 & life expectancy greater than 75 years
		List<Country> constMonarchyCountries = worldService.findConstMonarchyCountries();
		model.addAttribute("constMonarchyCountries", constMonarchyCountries);
		
		//Task 7
		//Return Country name, city name, district and population of all Argentinian cities inside Buenos Aires district
		//And have a population greater than 500,000
		List<City> buenosAiresCities = worldService.findBuenosAiresCities();
		model.addAttribute("buenosAiresCities", buenosAiresCities);
		
		//Task 8
		//Summarize number of countries in each region including name of region and # of countries in descending order
		List<Object[]> countriesByRegion = worldService.findCountriesByRegion();
		model.addAttribute("countriesByRegion", countriesByRegion);
		
		return "index.jsp";
	}

}
