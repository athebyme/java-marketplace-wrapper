package org.example.app.exceptions;

import java.io.Serial;

public class ProductNotFoundException extends IllegalArgumentException{
    @Serial
    private static final long serialVersionUID = 1L; // Для сериализации

    public ProductNotFoundException(String parameterName) {
        super("Parameter '" + parameterName + "' cannot be null.");
    }
    public ProductNotFoundException(CloneNotSupportedException e) {
        super("Exception " + e );
    }
}
