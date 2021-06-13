package com.hoang.soapServiceTest.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import javax.xml.bind.JAXBException;
@Configuration
public class NumberConvertClientConfig {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.hoang.soapServiceTest.client.gen");
        return marshaller;
    }

    @Bean
    public NumberConvertClient numberConvertClient(Jaxb2Marshaller marshaller){
        NumberConvertClient client = new NumberConvertClient();
        client.setDefaultUri("https://www.dataaccess.com/webservicesserver/NumberConversion.wso");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
