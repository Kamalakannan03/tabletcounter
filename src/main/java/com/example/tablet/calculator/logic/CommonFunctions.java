package com.example.tablet.calculator.logic;

import com.example.tablet.calculator.model.Request;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;
@Component
public class CommonFunctions {
    public long dateIntervalCalculator(Request request) throws ParseException {
        SimpleDateFormat sdf
                = new SimpleDateFormat(
                "dd-MM-yyyy HH:mm:ss");//09-10-2023 00:00:00
        Date d1 = sdf.parse(request.getStartDate());
        Date d2 = sdf.parse(request.getEndDate());
        long diffInMillies = Math.abs(d1.getTime() - d2.getTime());
        return TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
    }
    public int tabletCountPerDay(Request request){
        int sum=0;
        List<Integer> listOfTabletsPerDay = request.getIntervals();
        for(int i : listOfTabletsPerDay){
            sum +=i;
        }
        return sum;
    }
}
