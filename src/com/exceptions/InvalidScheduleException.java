package com.exceptions;

public class InvalidScheduleException extends Exception{
    public InvalidScheduleException(){
        super("Еhe schedule is not full");
    }
}
