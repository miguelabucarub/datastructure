package com.abucarub.miguel.datastructure.circularqueue;

class EmptyQueueException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public EmptyQueueException() {
        super();
    }

    public EmptyQueueException(String message) {
        super(message);
    }

}