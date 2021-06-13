package com.hoang.soapServiceTest.controller;

import com.hoang.soapServiceTest.client.NumberConvertClient;
import com.hoang.soapServiceTest.client.NumberToWords;
import com.hoang.soapServiceTest.client.NumberToWordsResponse;
import com.hoang.soapServiceTest.client.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/convert")
public class controller {
    private static final String url = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso";

    @Autowired
    private NumberConvertClient numberConvertClient;

    @PostMapping(value = "", consumes = MediaType.ALL_VALUE)
    public NumberToWordsResponse numberToWordsResponse(@RequestBody NumberToWords number){
        ObjectFactory request = new ObjectFactory();
        NumberToWords sub = request.createNumberToWords();
        sub.setUbiNum(number.getUbiNum());
        return numberConvertClient.getNumberConvert(url, sub);
    }
}
