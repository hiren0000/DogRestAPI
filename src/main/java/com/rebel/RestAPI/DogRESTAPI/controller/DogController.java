package com.rebel.RestAPI.DogRESTAPI.controller;

import com.rebel.RestAPI.DogRESTAPI.entity.Dog;
import com.rebel.RestAPI.DogRESTAPI.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController
{
    @Autowired
    private DogService dogService;

    @GetMapping("/dogs")
    public ResponseEntity<List<Dog>> getAllDogs()
    {
        List<Dog> dogs = dogService.getAllDogs();
         return new ResponseEntity<List<Dog>>(dogs, HttpStatus.OK);
    }

    @GetMapping("/dogs/name")
    public ResponseEntity<List<String>> getAllDogsName()
    {
        List<String> dogsName = dogService.findAllName();
        return new ResponseEntity<List<String>>(dogsName, HttpStatus.OK);
    }

    @GetMapping("/dogs/breed")
    public ResponseEntity<List<String>> getAllDogsBreed()
    {
        List<String> dogsBreed = dogService.findAllBreed();
        return new ResponseEntity<List<String>>(dogsBreed, HttpStatus.OK);
    }

    @GetMapping("/{Id}/breed")
    public ResponseEntity<String> getById(@PathVariable() Long Id)
    {
       String breed =  dogService.getById(Id);
        return new ResponseEntity<String>(breed, HttpStatus.OK);
    }


}
