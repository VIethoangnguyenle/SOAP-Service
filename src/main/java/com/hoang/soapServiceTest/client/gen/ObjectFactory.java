package com.hoang.soapServiceTest.client.gen;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName _NumberToWords_QNAME = new QName("https://www.dataaccess.com/webservicesserver/", "NumberToWords");
    private final static QName _NumberToWordsResponse_QNAME = new QName("https://www.dataaccess.com/webservicesserver/", "NumberToWordsResponse");

    public ObjectFactory(){

    }

    public NumberToWords createConvertRequest(){
        return new NumberToWords();
    }

    public NumberToWordsResponse createConvertResponse(){
        return new NumberToWordsResponse();
    }

    @XmlElementDecl(name = "NumberToWords", namespace = "http://www.dataaccess.com/webservicesserver/")
    public JAXBElement<NumberToWords>createNumberConvert(NumberToWords request){

        return new JAXBElement<NumberToWords>(_NumberToWords_QNAME, NumberToWords.class, null, request);
    }
}
