package br.com.myproject.exception;

public class InvalidAmountValueException extends RuntimeException {
    public InvalidAmountValueException(String menssage) {
        super(menssage);
    }
}
