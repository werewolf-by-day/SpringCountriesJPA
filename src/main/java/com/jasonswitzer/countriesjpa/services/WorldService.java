package com.jasonswitzer.countriesjpa.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jasonswitzer.countriesjpa.models.*;
import com.jasonswitzer.countriesjpa.repositories.*;


@Service
public class WorldService {
	
	private CountryRepository countryRepository;
	private LanguageRepository languageRepository;
	private CityRepository cityRepository;
	
	public WorldService(CountryRepository countryRepository, LanguageRepository languageRepository, CityRepository cityRepository) {
		this.countryRepository = countryRepository;
		this.languageRepository = languageRepository;
		this.cityRepository = cityRepository;
	}
	
	public List<Object[]> findCountriesSpeakingSlovene() {
		return countryRepository.findCountriesSpeakingSlovene();
	}
	
	public List<Object[]> findCitiesCountByCountry() {
		return countryRepository.findCitiesCountByCountry();
	}
	
	public List<Object[]> findLargeLanguagePercentageByCountry() {
		return countryRepository.findLargeLanguagePercentageByCountry();
	}
	
	public List<Country> findSmallCountries() {
		return countryRepository.findSmallCountries();
	}
	
	public List<Country> findConstMonarchyCountries() {
		return countryRepository.findConstMonarchyCountries();
	}
	
	public List<Object[]> findCountriesByRegion() {
		return countryRepository.findCountriesByRegion();
	}
	
	public List<City> findMexicanCities() {
		return cityRepository.findMexicanCities();
	}
	
	public List<City> findBuenosAiresCities() {
		return cityRepository.findBuenosAiresCities();
	}
}
