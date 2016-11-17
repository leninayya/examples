package com.example.exampleservice.controller;

import com.example.exampleservice.data.ExampleBean;
import com.example.exampleservice.repository.ExampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/examples")
public class ExampleController {
    @Autowired
    ExampleRepository exampleRepository;
    @GetMapping("")
    public List<ExampleBean> example(){
        return exampleRepository.findAll();
    }
    @PostMapping("")
    public void create(){
        ExampleBean e = new ExampleBean();
        e.setData("{\n" +
                "    \"name\": \"tea pot\",\n" +
                "    \"price\": 12.50,\n" +
                "    \"tags\": [\"home\", \"tea\"]\n" +
                "}");
        exampleRepository.save(e);
    }
}
