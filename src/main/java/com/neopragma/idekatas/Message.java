package com.neopragma.idekatas;

public interface Message {
    Object getHeader();
    Object getBody();
    String getBodyAsString();
}
