package com.b1a9idps.springcloudcontractsample.producer.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b1a9idps.springcloudcontractsample.producer.dto.Brand;
import com.b1a9idps.springcloudcontractsample.producer.dto.BrandListDto;

@RestController
@RequestMapping("/brands")
public class BrandController {

    @GetMapping
    public BrandListDto list() {
        Brand stof = new Brand();
        stof.setName("STOF");
        stof.setDesigner("Tanita");

        BrandListDto listDto = new BrandListDto();
        listDto.setBrands(List.of(stof));
        return listDto;
    }
}
