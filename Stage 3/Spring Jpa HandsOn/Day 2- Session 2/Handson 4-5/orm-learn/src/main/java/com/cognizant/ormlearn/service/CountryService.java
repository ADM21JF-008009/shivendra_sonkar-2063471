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
            throw new CountryNotFoundException();
        }
        return result.get();
    }

    @Transactional
    public void addCountry(Country country) {
        repository.save(country);
    }

    @Transactional
    public void updateCountry(String co_code, String co_name) {

        Optional<Country> optionalCountry=repository.findById(co_code);
        Country country=optionalCountry.get();
        country.setName(co_name);
        repository.save(country);
    }

    @Transactional
    public void deleteCountry(String co_code) {
        repository.deleteById(co_code);
    }

    @Transactional
    public List<Country> findByNameContaining(String str){
        List<Country> list=repository.findByNameContaining(str);
        return list;
    }

    @Transactional
    public List<Country> findByNameContainingOrderByAsc(String str){
        List<Country> list=repository.findByNameContainingOrderByNameAsc(str);
        return list;
    }

    @Transactional
    public List<Country> findByNameStartingWith(String str){
        return repository.findByNameStartingWith(str);
    }
}
