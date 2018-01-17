package com.neopragma.idekatas;

public class SoapMessage implements Message {
    private Object header;
    private Object body;

    public SoapMessage(Object header, Object body) {
        this.header = header;
        this.body = body;
    }

    public Object getHeader() {
        return header;
    }

    public Object getBody() {
        return body;
    }

    public String getBodyAsString() {
        return body.toString();
    }
}
