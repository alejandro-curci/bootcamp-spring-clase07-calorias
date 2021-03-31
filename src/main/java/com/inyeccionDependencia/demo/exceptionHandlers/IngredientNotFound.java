package com.inyeccionDependencia.demo.exceptionHandlers;

public class IngredientNotFound extends Exception {
    public IngredientNotFound(String message) {
        super(message);
    }
}
