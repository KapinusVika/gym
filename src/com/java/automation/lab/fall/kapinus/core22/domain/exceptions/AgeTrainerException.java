package com.java.automation.lab.fall.kapinus.core22.domain.exceptions;

public class AgeTrainerException extends Exception{
    public AgeTrainerException(){
        super("The Trainer must be over 18 years old");
    }
}
