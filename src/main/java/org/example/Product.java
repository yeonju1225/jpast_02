package org.example;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

//다대다
@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @OneToMany(mappedBy = "products")
    private List<MemberProduct> memberProductss = new ArrayList<>();

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
