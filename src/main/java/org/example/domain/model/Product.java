package org.example.domain.model;


import org.example.domain.exceptions.NotCloneableException;
import org.example.domain.model.abstractions.Category;
import org.example.domain.model.abstractions.Marketplace;
import org.example.domain.model.abstractions.Price;
import org.example.domain.model.valueObjects.Id;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import java.util.List;

@Entity
public class Product implements Cloneable{
    @EmbeddedId
    private Id id;
    private String name;
    private String description;
    @Embedded
    private Price price;
    @ElementCollection
    private List<String> images;
    @Embedded
    private Category category;
    @Embedded
    private Marketplace marketplace;
    public Product() {}

    @Override
    public Product clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new NotCloneableException(e);
        }
    }
    public void setId(Id id) {
        this.id = id;
    }
    public Id getId() {
        return id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setPrice(Price price) {
        this.price = price;
    }
    public Price getPrice() {
        return price;
    }
    public void setImages(List<String> images) {
        this.images = images;
    }
    public List<String> getImages() {
        return images;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public Category getCategory() {
        return category;
    }
}
