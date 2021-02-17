package com.abucarub.miguel.datastructure.circularqueue;

class FullQueueException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public FullQueueException() {
        super();
    }

    public FullQueueException(String message) {
        super(message);
    }

}