package com.hoang.soapServiceTest.client.gen;

import lombok.Data;

import javax.naming.Name;
import javax.xml.bind.annotation.*;

@Data
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberToWords", propOrder = {
        "ubiNum"
})
public class NumberToWords {

    @XmlElement(required = true, name = "ubiNum")
    protected long ubiNum;

    public void setUbiNum(long ubiNum) {
        this.ubiNum = ubiNum;
    }
}
