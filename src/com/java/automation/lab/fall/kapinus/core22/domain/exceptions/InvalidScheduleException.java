package com.java.automation.lab.fall.kapinus.core22.domain.exceptions;

public class InvalidScheduleException extends Exception{
    public InvalidScheduleException(){
        super("Еhe schedule is not full");
    }
}
