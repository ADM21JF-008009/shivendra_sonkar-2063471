package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.util.List;

public class CountryService {
    @Autowired
    private CountryRepository repository;

    @Transactional
    public List<Country> getAllCountries() {
        return repository.findAll();
    }
}
