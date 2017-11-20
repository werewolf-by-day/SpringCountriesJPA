package com.jasonswitzer.countriesjpa.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jasonswitzer.countriesjpa.models.Language;

@Repository
public interface LanguageRepository extends CrudRepository<Language, Long>{

}
