package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.exception.CountryNotFoundException;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public class CountryService {
    @Autowired
    private CountryRepository repository;

    @Transactional
    public List<Country> getAllCountries() {
        return repository.findAll();
    }
    @Transactional
    public Country findCountryByCode(String countryCode) throws CountryNotFoundException{
        Optional<Country> result=repository.findById(countryCode);
        if(!result.isPresent()) {
            throw new CountryNotFoundException("Country Not Found");
        }
        return result.get();
    }

    @Transactional

    public void addCountry(Country country) {
        repository.save(country);
    }

    @Transactional
    public void updateCountry(String code,String name) {
        Optional<Country> result=repository.findById(code);
        Country country=result.get();
        country.setName(name);
        repository.save(country);
    }

    @Transactional
    public void deleteCountry(String code) {

        repository.deleteById(code);
    }
}
