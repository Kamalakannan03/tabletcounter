package com.example.tablet.calculator.contoller;

import com.example.tablet.calculator.model.Request;
import com.example.tablet.calculator.service.Tablet.CalcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

@RestController
public class TabletCalcController {
    @Autowired
    CalcService calcService;
    @GetMapping("/tabletsCount")
    public String getTabletCount(@RequestBody Request request) throws ParseException {
        long tabletsCount =calcService.getTabletCount(request);
        return "Tablets required to Buy "+tabletsCount;
        //System.out.println("Total Tablets required to Buy===>"+tabletsCount);
    }

}
