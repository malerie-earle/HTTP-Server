package com.keyin.rest.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class LocationController {
    @Autowired
    private LocationService locationService;


    @PostMapping("location")
    public Location createLocation (@RequestBody Location newLocation){
        return locationService.createLocation(newLocation);
    }

    @GetMapping("locations")
    public List<Location> getAllLocations(){
        return locationService.getAllLocations();
    }

    @GetMapping("location/{index}")
    public Location getLocation(@PathVariable Integer index){
        return locationService.getLocation(index);
    }

    @GetMapping("search_location")
    public List<Location> findLocationByProvince(@RequestParam(value = "province", required = false) String province){
        return locationService.findLocationByProvince(province);
    }

    @PutMapping ("location/{index}")
    public Location updateLocation(@PathVariable Integer index, @RequestBody Location updatedLocation){
        return locationService.updateLocation(index, updatedLocation);
    }

    @DeleteMapping ("location/{index}")
    public void deleteLocation(@PathVariable Integer index){
        locationService.deleteLocation(index);
    }
}
