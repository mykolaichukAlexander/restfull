package com.restfull.restfull;

public class OrderNotFoundException extends RuntimeException{
    OrderNotFoundException(Long id){
        super("OrderNotFoundException " + id);
    }
}
