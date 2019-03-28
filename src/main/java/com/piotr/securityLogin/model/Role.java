package com.piotr.securityLogin.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    //really important!!!
    @Override
    public String toString() {
        return super.toString();
    }
}
