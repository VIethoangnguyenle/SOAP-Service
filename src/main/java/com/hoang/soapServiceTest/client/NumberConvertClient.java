package com.hoang.soapServiceTest.client;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class NumberConvertClient extends WebServiceGatewaySupport {

    public NumberToWordsResponse getNumberConvert(String url, NumberToWords request){
        NumberToWordsResponse response = (NumberToWordsResponse) getWebServiceTemplate()
            .marshalSendAndReceive(url, request);

        return response;
    }
}
