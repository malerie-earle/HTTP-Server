package com.keyin.rest.city;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class CityController {
    @Autowired
    private CityService cityService;


    @PostMapping("city")
    public City createCity (@RequestBody City newCity){
        return cityService.createCity(newCity);
    }

    @GetMapping("cities")
    public List<City> getAllCities(){
        return cityService.getAllCities();
    }

    @GetMapping("city/{index}")
    public City getCity(@PathVariable Integer index){
        return cityService.getCity(index);
    }

    @GetMapping("search_city")
    public List<City> findCityByProvince(@RequestParam(value = "province", required = false) String province){
        return cityService.findCityByProvince(province);
    }

    @PutMapping ("city/{index}")
    public City updateCity(@PathVariable Integer index, @RequestBody City updatedCity){
        return cityService.updateCity(index, updatedCity);
    }

    @DeleteMapping ("city/{index}")
    public void deleteCity(@PathVariable Integer index){
        cityService.deleteCity(index);
    }
}
