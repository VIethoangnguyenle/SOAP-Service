package com.hoang.soapServiceTest.client;

import com.hoang.soapServiceTest.client.gen.NumberToWordsResponse;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

public class NumberConvertClient extends WebServiceGatewaySupport {

    public NumberToWordsResponse getNumberConvert(String url, Object request){

        JAXBElement response = (JAXBElement) getWebServiceTemplate()
                .marshalSendAndReceive(url, request);
        return (NumberToWordsResponse) response.getValue();
    }
}
