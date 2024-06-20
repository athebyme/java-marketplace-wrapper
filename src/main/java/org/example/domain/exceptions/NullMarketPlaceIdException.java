package org.example.domain.exceptions;

import java.io.Serial;

public class NullMarketPlaceIdException extends IllegalArgumentException{
    @Serial
    private static final long serialVersionUID = 1L; // Для сериализации

    public NullMarketPlaceIdException(String parameterName) {
        super("Parameter '" + parameterName + "' cannot be null.");
    }
    public NullMarketPlaceIdException(CloneNotSupportedException e) {
        super("Exception " + e );
    }
}

