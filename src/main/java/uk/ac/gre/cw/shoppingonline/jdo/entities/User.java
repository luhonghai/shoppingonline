package uk.ac.gre.cw.shoppingonline.jdo.entities;
import javax.jdo.annotations.*;
@PersistenceCapable
public class User {

    @PrimaryKey
    @Persistent( valueStrategy = IdGeneratorStrategy.IDENTITY )
    private Long id;

    @Persistent
    private String name;

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
}
