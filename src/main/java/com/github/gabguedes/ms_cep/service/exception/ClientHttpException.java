package com.github.gabguedes.ms_cep.service.exception;

public class ClientHttpException extends RuntimeException{
    public ClientHttpException (String message) {
        super(message);
    }
}
