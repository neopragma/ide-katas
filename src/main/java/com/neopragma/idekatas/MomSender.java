package com.neopragma.idekatas;

public class MomSender extends Sender {

    @Override
    public SendStatus send(Message momMessage) {
        System.out.println("MomSender.send(): " + momMessage.getBodyAsString());
        return SendStatus.SUCCESS;
    }
}
