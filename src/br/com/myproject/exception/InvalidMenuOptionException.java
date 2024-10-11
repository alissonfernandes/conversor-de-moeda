package br.com.myproject.exception;

public class InvalidMenuOptionException extends RuntimeException {
    public InvalidMenuOptionException(String menssage){
        super(menssage);
    }
}
