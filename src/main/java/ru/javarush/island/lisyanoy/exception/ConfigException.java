package ru.javarush.island.lisyanoy.exception;

public class ConfigException extends RuntimeException{

    public ConfigException(String message, Throwable cause) {
        super(message, cause);
    }

}
