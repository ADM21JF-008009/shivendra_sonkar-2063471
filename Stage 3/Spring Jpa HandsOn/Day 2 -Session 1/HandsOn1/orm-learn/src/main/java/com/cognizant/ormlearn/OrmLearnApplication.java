package com.cognizant.ormlearn;

import com.cognizant.ormlearn.exception.CountryNotFoundException;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    public static CountryService countryService;
    public static void main(String[] args) {

        ApplicationContext context=SpringApplication.run(OrmLearnApplication.class, args);
        countryService = context.getBean(CountryService.class);
        testGetAllCountries();
        LOGGER.info("Inside main");
    }
    public static void testGetAllCountries(){
        LOGGER.info("Start");
        List<Country> countries = countryService.getAllCountries();
        LOGGER.debug("countries={}", countries);
        LOGGER.info("End");

    }
    private static void testFindCountryByCode() {
        try {
            Country country = countryService.findCountryByCode("ME");
            System.out.println(country.getName());
        } catch (CountryNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void testAddCountry() {
        Country newCountry = new Country();
        newCountry.setCode("KM");
        newCountry.setName("MEGH");
        countryService.addCountry(newCountry);
        testFindCountryByCode();

    }

    private static void testUpdateCountry() {
        countryService.updateCountry("KM", "Megh");
    }

    private static void testDeleteCountry() {
        countryService.deleteCountry("KM");
    }

    private static void testFindByNameContaining() {

        List<Country> cList = countryService.findByNameContaining("ou");
        System.out.println("countries containing ou in name");
        for (Country c : cList) {
            System.out.println(c.getCode() + " " + c.getName());
        }
    }

    private static void testFindByNameContainingOrderByAsc() {

        List<Country> cList = countryService.findByNameContainingOrderByAsc("ou");
        System.out.println("countries containing ou in name ascending order");
        for (Country c : cList) {
            System.out.println(c.getCode() + " " + c.getName());
        }
    }

    private static void testfindByNameStartingWith() {
        List<Country> list = countryService.findByNameStartingWith("z");
        for (Country c : list) {
            System.out.println(c.getCode() + " " + c.getName());
        }
    }
}
