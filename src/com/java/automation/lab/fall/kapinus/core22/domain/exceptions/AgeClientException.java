package com.java.automation.lab.fall.kapinus.core22.domain.exceptions;

public class AgeClientException extends Exception {
    public AgeClientException(){
        super("The client must be over 10 years old");
    }
}
