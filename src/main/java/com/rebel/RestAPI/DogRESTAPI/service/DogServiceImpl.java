package com.rebel.RestAPI.DogRESTAPI.service;

import com.rebel.RestAPI.DogRESTAPI.entity.Dog;
import com.rebel.RestAPI.DogRESTAPI.repo.DogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService
{
    @Autowired
    private DogRepo dogRepo;

    @Override
    public List<Dog> getAllDogs() {
        return dogRepo.findAll();
    }

    @Override
    public List<String> findAllBreed() {
        return dogRepo.findAllBreed();
    }

    @Override
    public List<String> findAllName() {
        return dogRepo.findAllName();
    }

    @Override
    public String getById(Long id) {

        Optional<String> optionalBreed = Optional.ofNullable(dogRepo.findBreedById(id));
        String breed = optionalBreed.orElseThrow(DogNotFoundException::new);
        return breed;



    }
}
