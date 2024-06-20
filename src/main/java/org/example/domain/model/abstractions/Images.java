package org.example.domain.model.abstractions;

import java.util.Objects;

public abstract class Images {
    private String[] images_urls;
    public Images(String[] images_urls) {
        Objects.requireNonNull(images_urls);
        this.images_urls = images_urls;
    }
    public String[] getImagesUrls() {
        return images_urls;
    }
    public void setImagesUrls(String[] images_urls) {
        Objects.requireNonNull(images_urls);
        this.images_urls = images_urls;
    }
}
