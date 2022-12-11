package com.rebel.RestAPI.DogRESTAPI.controller;

import com.rebel.RestAPI.DogRESTAPI.service.DogService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.StaticWebApplicationContext;

@RunWith(SpringRunner.class)
@WebMvcTest(DogController.class)
public class DogControllerUnitTest
{
    @Autowired
    private MockMvc mockMvc;




    @Autowired
    private DogService dogService;

    @Test
    public void getDogs()
    {
        //could not find the perform functon
        String url = "/dogs";
        mockMvc.perform(MockMvcRequestBuilders.get(url));
    }
}
