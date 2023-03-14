package com.firstApp.Example.examples.q1;

import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class BussinessCalculationService {
    private DataService dataService;
    
    public BussinessCalculationService(DataService dataService) {
        super();
        this.dataService = dataService;
    }

    public int findMax() {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}
