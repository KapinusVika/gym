package com.java.automation.lab.fall.kapinus.core22.domain.exceptions;

public class InvalidDiscountException extends Exception{
    public InvalidDiscountException(){
        super("The discount cannot be more than 100");
    }
}
