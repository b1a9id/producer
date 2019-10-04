package com.b1a9idps.springcloudcontractsample.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.springcloudcontractsample.producer.dto.Brand;

@RestController
@RequestMapping("/brands")
public class BrandController {

    @GetMapping
    public Brand list() {
        Brand stof = new Brand();
        stof.setName("STOF");
        stof.setDesigner("Tanita");
        return stof;
    }
}
