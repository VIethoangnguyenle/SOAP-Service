package com.hoang.soapServiceTest.client.gen;

import lombok.Data;

import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberToWordsResponse", propOrder = {
        "NumberToWordsResult"
})
public class NumberToWordsResponse {

    @XmlElement(required = true, name ="NumberToWordsResult")
    protected String NumberToWordsResult;
}

