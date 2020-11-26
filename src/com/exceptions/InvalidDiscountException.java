package com.exceptions;

public class InvalidDiscountException extends Exception{
    public InvalidDiscountException(){
        super("The discount cannot be more than 100");
    }
}
