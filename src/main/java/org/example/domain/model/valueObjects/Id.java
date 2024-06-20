package org.example.domain.model.valueObjects;


import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
public class Id implements Serializable {
    private UUID systemId;
    private String marketplaceId;

    public Id() {
        this.systemId = UUID.randomUUID();
        marketplaceId = null;
    }

    public Id(String marketplaceId) {
        this.systemId = UUID.randomUUID();
        this.marketplaceId = marketplaceId;
    }

    public Id(UUID systemId, String marketplaceId) {
        this.systemId = systemId;
        this.marketplaceId = marketplaceId;
    }

    public UUID getSystemId() {
        return systemId;
    }

    public void setSystemId(UUID systemId) {
        this.systemId = systemId;
    }

    public String getMarketplaceId() {
        return marketplaceId;
    }

    public void setMarketplaceId(String marketplaceId) {
        this.marketplaceId = marketplaceId;
    }
}