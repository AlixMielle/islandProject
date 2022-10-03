package com.example.demo.dao;

import com.example.demo.Entity.Country;

import java.util.List;
import java.util.Optional;

public interface CountryDAO {


    List<Country> findAll();

    boolean create(Country country);

    Optional<Country> findById(long idParam);

    boolean delete(long id);

    boolean edit(Country countryToEdit);
}
