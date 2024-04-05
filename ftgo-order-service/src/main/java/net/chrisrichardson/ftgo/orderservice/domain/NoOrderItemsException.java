package net.chrisrichardson.ftgo.orderservice.domain;

public class NoOrderItemsException extends RuntimeException {
    public NoOrderItemsException() {
        super("Order must have at least one item");
    }
}