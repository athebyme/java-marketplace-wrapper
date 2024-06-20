package org.example.domain.model.abstractions;

import java.math.BigDecimal;

public abstract class Price {
    private final BigDecimal price;
    public Price(BigDecimal price){
        this.price = price;
    }
    public Price(int price){
        this.price = new BigDecimal(price);
    }
    public Price(float price){
        this.price = new BigDecimal(price);
    }
    public BigDecimal getPrice(){
        return price;
    }
}
