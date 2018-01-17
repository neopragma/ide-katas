package com.neopragma.idekatas;

public class Sender {

    public SendStatus send(Message message) {
        System.out.println("Sender.send(): default implementation");
        return SendStatus.SUCCESS;
    }
}
