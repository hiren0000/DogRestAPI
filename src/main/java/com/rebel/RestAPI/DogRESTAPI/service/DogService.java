package com.rebel.RestAPI.DogRESTAPI.service;

import com.rebel.RestAPI.DogRESTAPI.entity.Dog;

import java.util.List;

public interface DogService
{
    List<Dog> getAllDogs();

    List<String> findAllBreed();

    List<String> findAllName();

    String getById(Long id);

}
