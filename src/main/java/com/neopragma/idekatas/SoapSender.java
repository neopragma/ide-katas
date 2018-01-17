package com.neopragma.idekatas;

public class SoapSender extends Sender {

    @Override
    public SendStatus send(Message soapMessage) {
        System.out.println("SoapSender.send(): " + soapMessage.getBodyAsString());
        return SendStatus.SUCCESS;
    }
}
