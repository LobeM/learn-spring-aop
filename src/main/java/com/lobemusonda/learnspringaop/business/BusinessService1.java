package com.lobemusonda.learnspringaop.business;

import com.lobemusonda.learnspringaop.annotations.TrackTime;
import com.lobemusonda.learnspringaop.data.DataService1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService1 {

    private DataService1 dataService1;

    public BusinessService1(DataService1 dataService1) {
        this.dataService1 = dataService1;
    }

    @TrackTime
    public int calculateMax() {
        int[] data = dataService1.retrieveData();

        // throw new RuntimeException("Something went wrong");
        return Arrays.stream(data).max().orElse(0);
    }
}
