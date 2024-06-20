package org.example.domain.exceptions;

import java.io.Serial;

public class NullParameterException extends IllegalArgumentException{
    @Serial
    private static final long serialVersionUID = 1L; // Для сериализации

    public NullParameterException(String parameterName) {
        super("Parameter '" + parameterName + "' cannot be null.");
    }
}
