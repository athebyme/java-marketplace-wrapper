package org.example.domain.model.abstractions;

import java.util.Objects;

public abstract class Marketplace {
    private final int id;
    private final String name;
    public Marketplace(int id, String name) {
        Objects.requireNonNull(name);
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
