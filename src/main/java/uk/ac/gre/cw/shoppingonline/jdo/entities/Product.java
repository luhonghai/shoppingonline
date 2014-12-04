package uk.ac.gre.cw.shoppingonline.jdo.entities;

import javax.jdo.annotations.IdGeneratorStrategy;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;

/**
 * Created by Long Nguyen on 12/4/14.
 */
@PersistenceCapable (table = "Product")
public class Product {
    @PrimaryKey
    @Persistent( valueStrategy = IdGeneratorStrategy.IDENTITY , column = "Product_ID")
    private Long id;

    @Persistent(column = "Name")
    private String name;

    @Persistent (column = "Specifications")
    private String specifications;

    @Persistent (column = "Unit_Price")
    private float unitPrice;

    @Persistent (column = "Catalogue_ID")
    private Long catalogueId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getCatalogueId() {
        return catalogueId;
    }

    public void setCatalogueId(Long catalogueId) {
        this.catalogueId = catalogueId;
    }
}
