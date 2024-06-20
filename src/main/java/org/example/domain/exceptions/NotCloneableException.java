package org.example.domain.exceptions;

import java.io.Serial;

public class NotCloneableException extends IllegalArgumentException{
    @Serial
    private static final long serialVersionUID = 1L; // Для сериализации

    public NotCloneableException(String parameterName) {
        super("Parameter '" + parameterName + "' cannot be null.");
    }
    public NotCloneableException(CloneNotSupportedException e) {
        super("Exception " + e );
    }
}
