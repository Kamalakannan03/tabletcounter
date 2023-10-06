package com.example.tablet.calculator.service.Tablet;

import com.example.tablet.calculator.logic.CommonFunctions;
import com.example.tablet.calculator.model.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

@Service
public class CalcService {
    @Autowired
    CommonFunctions commonFunctions;
    public Long getTabletCount(Request request) throws ParseException {
        long daysInterval = 0;
        if(request.getDays()==0)
            daysInterval = commonFunctions.dateIntervalCalculator(request)+1;
        else
            daysInterval = request.getDays();
        int tabletsPerDay = commonFunctions.tabletCountPerDay(request);
        System.out.println("daysInterval===>"+daysInterval);
        System.out.println("tabletsPerDay===>"+tabletsPerDay);
        return daysInterval*tabletsPerDay;
    }

}
